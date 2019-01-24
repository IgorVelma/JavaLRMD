package Clinic;

import lib.Cat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    private Client client;
    private String nameClient = "Fiks";
    private String namePet = "Cat";

    @Before
    public void setUp() throws Exception{
        this.client = new Client(this.nameClient, new Cat(this.namePet));
    }

    @Test
    public void getNameTest(){
        assertEquals(this.nameClient, client.getClientName());
    }

    @Test
    public void getPetNameTest(){
        assertEquals(this.namePet, client.getPetName());
    }


}