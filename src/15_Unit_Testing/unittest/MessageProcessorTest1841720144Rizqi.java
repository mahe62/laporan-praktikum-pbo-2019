/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;
import org.junit.Assert;
import org.junit.Test;

import unittest.MessageProcessor1841720144Rizqi;

/**
 *
 * @author ASUS
 */


public class MessageProcessorTest1841720144Rizqi {
    
    MessageProcessor1841720144Rizqi mProcessor;
    public MessageProcessorTest1841720144Rizqi(){
        mProcessor=new MessageProcessor1841720144Rizqi();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Messi");
        mProcessor.setMessage("Whats up Dude?");
        mProcessor.showMessageRizqi();
    }
    @Test
    public void showMessageRizqi(){
        String expectedResult ="Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up Bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatRizqi());
    }
        
}
