package com.qainfotech.tap.training.snl.api;

/**
 *
 * @author Ramandeep
 */
public class NoUserWithSuchUUIDException extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -5147089907483006584L;

	public NoUserWithSuchUUIDException(String uuid){
        super("No Player with uuid '"+uuid+"' on board");
    }
}
