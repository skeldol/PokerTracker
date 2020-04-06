import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.internal.util.SerializationHelper;

import com.pokersimples.bo.Hand;

@Entity
public class HandHistory {;
	
	@Id
	private String id;
	
	BigDecimal netWinngs;
	
	@Lob
	private byte[] hand;
	
	public BigDecimal getNetWinngs() {
		return netWinngs;
	}

	public void setNetWinngs(BigDecimal netWinngs) {
		this.netWinngs = netWinngs;
	}

	public byte[] getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = SerializationHelper.serialize(hand);
		id = hand.getHandId();
	}

	
}
