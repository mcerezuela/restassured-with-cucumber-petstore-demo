package com.petstore.service;

import com.petstore.entities.endpoints.EndPointsWrapper;
import com.petstore.PetStoreUtils;
import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestPetstore extends TestCase {

    Petstore petstore;
    @BeforeClass
    public void setUp() throws Exception {
        super.setUp();
        petstore = PetStoreUtils.getReferencePetStore();
    }


    @Test
    public void testGetOpenapi() {
        System.out.println("Full TEXT: " + petstore.toString());
        System.out.println("getOpenAPI: " + petstore.getOpenapi());
        Assert.assertFalse(petstore.getOpenapi().isEmpty());

    }

    @Test
    public void testSetOpenapi() {
        petstore.setOpenapi(null);
        Assert.assertNull(petstore.getOpenapi());
    }

    @Test
    public void testGetInfo() {
        System.out.println("getGetInfo: " + petstore.getInfo().toString());
        Assert.assertNotNull(petstore.getInfo());
    }

    @Test
    public void testSetInfo() {
        petstore.setInfo(null);
        Assert.assertNull(petstore.getInfo());
    }

    @Test
    public void testGetExternalDocs() {
        System.out.println("GetExternalDocs: " + petstore.getExternalDocs().toString());
        Assert.assertNotNull(petstore.getExternalDocs());
    }

    @Test
    public void testSetExternalDocs() {
        petstore.setExternalDocs(null);
        System.out.println("SetExternalDocs: " + (null == petstore.getExternalDocs()));
        Assert.assertTrue((null == petstore.getExternalDocs()));
    }

    @Test
    public void testGetServers() {
        System.out.println("GetServers: " + petstore.getServers().toString());
        Assert.assertNotNull(petstore.getServers());
    }

    @Test
    public void testSetServers() {
        petstore.setServers(null);
        System.out.println("SetServers: " + (null == petstore.getServers()));
        Assert.assertTrue((null == petstore.getServers()));
    }

    @Test
    public void testGetTags() {
        System.out.println("GetTags: " + petstore.getTags().toString());
        Assert.assertNotNull(petstore.getTags());
    }

    @Test
    public void testSetTags() {
        petstore.setTags(null);
        System.out.println("SetTags: " + (null == petstore.getTags()));
        Assert.assertNull(petstore.getTags());
    }

    @Test
    public void testGetPaths() {
        System.out.println("GetPaths: " + petstore.getPaths().toString());
        Assert.assertNotNull(petstore.getPaths());
    }

    @Test
    public void testGetPathsGetPetFindByStatus() {
        System.out.println("CALL getPaths() ");
        EndPointsWrapper endPointsWrapper = PetStoreUtils.extractEndPoints(petstore.getPaths());
        System.out.println(endPointsWrapper);
        Assert.assertNotNull(petstore.getPaths());
    }

    @Test
    public void testSetPaths() {
        petstore.setPaths(null);
        System.out.println("SetPaths: " + (null == petstore.getPaths()));
        Assert.assertNull(petstore.getPaths());
    }

    @Test
    public void testGetComponents() {
        System.out.println("GetComponents: " + petstore.getComponents().toString());
        Assert.assertNotNull(petstore.getComponents());
    }

    @Test
    public void testSetComponents() {
        petstore.setComponents(null);
        System.out.println("SetComponents: " + (null == petstore.getComponents()));
        Assert.assertNull(petstore.getComponents());
    }

}