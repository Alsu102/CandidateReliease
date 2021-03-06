package sample;

/*************************************************************************************************************
 * Author      : Alsu Saifetdinova
 * Created       : 11/09/2018
 * FileName     : ScreenSpec.java
 * Source		: Code written based on specifications provided in Oracle Academy's OraclProduction document.
 * 				  All rights for the document and specifications belong to Oracle.
 * Description  : Interface that defines the following methods.
 ************************************************************************************************************/


//Interface that contains all screen specification methods.
public interface ScreenSpec {

  /**
   * This method gets the screen resolution specification of the product.
   * @return: resolution spec.
   */
  public String getResolution();

  /**
   * This method gets the screen refresh rate specification of the product.
   * @return: refresh rate spec.
   */
  public int getRefreshRate();

  /**
   * This method gets the screen response time specification of the product.
   * @return: the response time value.
   */
  public int getResponseTime();

}