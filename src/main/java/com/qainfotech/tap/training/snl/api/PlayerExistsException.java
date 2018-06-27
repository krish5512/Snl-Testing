package com.qainfotech.tap.training.snl.api;

/**
 *
 * @author Ramandeep
 */
public class PlayerExistsException extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5804889705925933863L;

	public PlayerExistsException(String name){
        super("Player '"+name+"' already exists on board");
    }
}
