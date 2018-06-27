package com.qainfotech.tap.training.snl.api;

import java.util.UUID;
/**
 *
 * @author Ramandeep
 */
public class InvalidTurnException extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -2452435494687383371L;

	public InvalidTurnException(UUID playerUuid){
        super("Player '"+playerUuid.toString()+"' does not have the turn");
    }
}
