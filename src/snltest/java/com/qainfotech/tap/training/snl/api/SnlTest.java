package com.qainfotech.tap.training.snl.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SnlTest {
	
	Board boardObject;
	JSONArray playerName;
	
	@BeforeClass
	public void beforeStart() throws FileNotFoundException, UnsupportedEncodingException, IOException
	{
		boardObject = new Board();
	}

	@Test (expectedExceptions = MaxPlayersReachedExeption.class)
	public void boardRegister() throws Exception {
		playerName = boardObject.registerPlayer("Krishna");
		playerName = boardObject.registerPlayer("Vishnu");
		playerName = boardObject.registerPlayer("abc");
		playerName = boardObject.registerPlayer("Ankit");
		playerName = boardObject.registerPlayer("Chetan");
		
	}
	
	@Test (expectedExceptions = PlayerExistsException.class)
	public void checkExistingPlayer() throws Exception
	{
		Board boardObj = new Board();
				
		JSONArray Name1 = boardObj.registerPlayer("ac");
		JSONArray Name2 = boardObj.registerPlayer("ac");
			
		}
	
	
    @Test (expectedExceptions = GameInProgressException.class)
    public void checkInProgress() throws Exception
    {
    	Board BoardObject=new Board() ;
    	BoardObject.registerPlayer("krishna");
    	JSONObject position=BoardObject.getData().getJSONArray("players").getJSONObject(0);
    	System.out.println(position);
    	System.out.println(position.put("position",2));
    	BoardObject.registerPlayer("hitesh");
    	
    }
	
    @Test (expectedExceptions = InvalidTurnException.class)
    public void checkCrossTurnInMatch() throws FileNotFoundException, IOException, UnsupportedEncodingException, PlayerExistsException, GameInProgressException,
    FileNotFoundException, UnsupportedEncodingException,MaxPlayersReachedExeption, IOException, InvalidTurnException
    {
    	Board checkObj = new Board();
    	checkObj.registerPlayer("krishna");
    	checkObj.registerPlayer("hitesh");
    	JSONObject turn = new JSONObject();
    	UUID uuid1=(UUID) 
    			turn.getJSONObject("data").getJSONArray("players").getJSONObject(1).get("uuid");
    	checkObj.rollDice(uuid1);
    }
    @Test
    public void registerPlayertest() throws Exception {
    	Board BoardObject=new Board() ;
    	 BoardObject.registerPlayer("krishnakumar");
    }
    @Test
    public void validRolltest() throws Exception
    {
    	Board BoardObject=new Board() ;
    	 BoardObject.registerPlayer("varda1");
    		JSONObject root = new JSONObject(BoardObject);
    		UUID uuid=(UUID) root.getJSONObject("data").getJSONArray("players").getJSONObject(0).get("uuid");
    		BoardObject.rollDice(uuid);
    }
    
    
    
    
    
    
    
    
}
	
