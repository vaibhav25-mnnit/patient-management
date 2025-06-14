package com.patientmanagement.billing_service.grpc;

import billing.BillingResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import  billing.BillingServiceGrpc.BillingServiceImplBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@GrpcService
public class BillingGrpcService extends BillingServiceImplBase
{
    private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);

    @Override
    public void createBillingAccount(billing.BillingRequest billingRequest, StreamObserver<BillingResponse> responseObserver)
    {
        log.info("Creating billing account GRPC request {}",billingRequest.toString());

        // Business logic will go below this

        BillingResponse response = BillingResponse.newBuilder()
                .setAccountId("555")
                .setStatus("New")
                .build();


        responseObserver.onNext(response);
        responseObserver.onCompleted();  //This indicates this request response cycle is completed,we can add more response before adding this line
    }
}

