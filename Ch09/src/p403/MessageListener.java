package p403;

import p402.Button;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
