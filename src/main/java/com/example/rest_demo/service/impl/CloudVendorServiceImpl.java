package com.example.rest_demo.service.impl;

import com.example.rest_demo.model.CloudVendor;
import com.example.rest_demo.repo.CloudVendorRepo;
import com.example.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepo cloudVendorRepo;
    public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "create sucess";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "update sucess";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepo.deleteById(cloudVendorId);
        return "delete sucess";
    }

    @Override
    public String getCloudVendor(String cloudVendorId) {
        return String.valueOf(cloudVendorRepo.findById(cloudVendorId).get()); // return "get sucess"; }
    }
  /*  @Override
    public String getAllCloudVendors() {

        return "sucess";

    }*/
}
