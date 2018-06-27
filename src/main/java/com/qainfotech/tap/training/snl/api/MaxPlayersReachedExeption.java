package com.qainfotech.tap.training.snl.api;

/**
 *
 * @author Ramandeep
 */
public class MaxPlayersReachedExeption extends Exception{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 658721863509749787L;

	public MaxPlayersReachedExeption(Integer players){
        super("The board already has maximum allowed Player: " + players);
    }
}
