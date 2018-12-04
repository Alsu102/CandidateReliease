package sample;

/*************************************************************************************************************
 * Author      : Alsu Saifetdinova
 * Created       : 11/09/2018
 * FileName     : MultimediaControl.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document.
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : Interface that defines the following methods.
 ************************************************************************************************************/


public interface MultimediaControl {

  //item's play function.
  public void play();

  //item's stop function.
  public void stop();

  //item's previous function.
  public void previous();

  //item's next function.
  public void next();
}