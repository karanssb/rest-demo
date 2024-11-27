package com.example.rest_demo.service;

import com.example.rest_demo.model.CloudVendor;
public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);

    public String deleteCloudVendor(String cloudVendorId);

    public String getCloudVendor(String cloudVendorId);

    /*public List<CloudVendor> getAllCloudVendors();
*/
}
