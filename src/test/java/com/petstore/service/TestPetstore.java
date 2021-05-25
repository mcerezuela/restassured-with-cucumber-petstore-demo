package com.petstore.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestPetstore extends TestCase {

    Petstore  petstore;

    public void setUp() throws Exception {
        super.setUp();
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<Petstore> ref = new TypeReference<>() {};
        InputStream in = new FileInputStream("src/test/resources/swagger/petstore.json");
        petstore = mapper.readValue(in, ref);
        System.out.println("TEXT: "+petstore.getOpenapi());
    }

    public void testGetOpenapi() {
        Assert.assertTrue(!petstore.getOpenapi().isEmpty());

    }

    public void testSetOpenapi() {
    }

    public void testGetInfo() {
    }

    public void testSetInfo() {
    }

    public void testGetExternalDocs() {
    }

    public void testSetExternalDocs() {
    }

    public void testGetServers() {
    }

    public void testSetServers() {
    }

    public void testGetTags() {
    }

    public void testSetTags() {
    }

    public void testGetPaths() {
    }

    public void testSetPaths() {
    }

    public void testGetComponents() {
    }

    public void testSetComponents() {
    }

    public void testTestToString() {
    }

    public void testTestHashCode() {
    }

    public void testTestEquals() {
    }
}