package com.internousdev.template.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
			private Map<String,Object>session;

			public String execute(){
				BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
				buyItemCompleteDAO.buyItemInfo(session.get("id").toString(),
						//Stringの個数確認
											   session.get("login_user_id").toString(),
											   //順番DAOの順番と関係している。
											   session.get("buyItem_price").toString(),
											   session.get("stock").toString(),
											   session.get("pay").toString());
				String result =SUCCESS;
				return result;
			}
			public Map<String,Object> getSession(){
				return session;
			}
			@Override
			public void setSession(Map<String, Object>session){
				this.session= session;
			}

}
