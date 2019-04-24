/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.core.message;

import java.nio.ByteBuffer;

import io.seata.core.model.BranchStatus;
import io.seata.core.model.BranchType;
import io.seata.core.protocol.transaction.BranchReportRequest;

import org.junit.Assert;
import org.junit.Test;

/**
 * The type Branch report request test.
 */
public class BranchReportRequestTest {

    /**
     * Test to string.
     */
    @Test
    public void testToString() {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        branchReportRequest.setXid("127.0.0.1:8091:1249853");
        branchReportRequest.setBranchId(3);
        branchReportRequest.setResourceId("resource003");
        branchReportRequest.setStatus(BranchStatus.PhaseOne_Timeout);
        branchReportRequest.setApplicationData("test app data");
        Assert.assertEquals(
            "xid=127.0.0.1:8091:1249853,branchId=3,resourceId=resource003,status=PhaseOne_Timeout,"
                + "applicationData=test app"
                + " data",
            branchReportRequest.toString());
    }

    /**
     * Test decode.
     *
     * @throws Exception the exception
     */
    @Test
    public void testDecode() {
        BranchReportRequest branchReportRequest = new BranchReportRequest();
        branchReportRequest.setXid("127.0.0.1:8091:1249853");
        branchReportRequest.setBranchId(3);
        branchReportRequest.setResourceId("resource003");
        branchReportRequest.setStatus(BranchStatus.PhaseOne_Timeout);
        branchReportRequest.setApplicationData("test app data");
        branchReportRequest.setBranchType(BranchType.AT);

        byte[] encodeResult = branchReportRequest.encode();
        ByteBuffer byteBuffer = ByteBuffer.allocate(encodeResult.length);
        byteBuffer.put(encodeResult);
        byteBuffer.flip();

        BranchReportRequest decodeBranchReportRequest = new BranchReportRequest();
        decodeBranchReportRequest.decode(byteBuffer);
        Assert.assertEquals(branchReportRequest.getXid(), decodeBranchReportRequest.getXid());
        Assert.assertEquals(branchReportRequest.getBranchId(), decodeBranchReportRequest.getBranchId());
        Assert.assertEquals(branchReportRequest.getResourceId(), decodeBranchReportRequest.getResourceId());
        Assert.assertEquals(branchReportRequest.getStatus(), decodeBranchReportRequest.getStatus());
        Assert.assertEquals(branchReportRequest.getApplicationData(), decodeBranchReportRequest.getApplicationData());
        Assert.assertEquals(branchReportRequest.getBranchType(), decodeBranchReportRequest.getBranchType());
    }
}