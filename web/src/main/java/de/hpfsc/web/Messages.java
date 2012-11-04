package de.hpfsc.web;

/**
 * Interface to represent the messages contained in resource bundle:
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Enter your name and more".
   * 
   * @return translated "Enter your name and more"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();
}
