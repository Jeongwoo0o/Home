package model.DAO;

import java.util.ArrayList;

import model.VO.BurgerVO;
import model.VO.order;

public interface bdao {
	public ArrayList selectEvent() throws Exception;
    public ArrayList selectBurger() throws Exception;
    public ArrayList selectSide() throws Exception;
    public ArrayList selectDrink() throws Exception;
    public ArrayList selectSet() throws Exception;
    public ArrayList checkCoupon(String cNum) throws Exception;
    public void insertorder(BurgerVO vo) throws Exception;

}
