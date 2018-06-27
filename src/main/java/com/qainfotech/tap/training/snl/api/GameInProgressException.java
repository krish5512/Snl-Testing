package com.qainfotech.tap.training.snl.api;

/**
 *
 * @author Ramandeep 
 */
public class GameInProgressException extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -1697989606614595429L;

	public GameInProgressException(){
        super("New player cannot join since the game has started");
    }
}
