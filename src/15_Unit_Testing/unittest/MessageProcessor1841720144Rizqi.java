/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author ASUS
 */
public class MessageProcessor1841720144Rizqi {

    private String sender, recipient, message;

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public String messageFormatRizqi(){
        String message = String.format("Hai %s, You have message from %s.\nThe message as follows : %s",
                this.recipient,this.sender,this.message);
        return message;
    }
    
    public void showMessageRizqi(){
        System.out.println(messageFormatRizqi());
    }
}
