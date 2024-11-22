package estudo.tryCatch.excecaoPersonalizada;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import estudo.tryCatch.excecaoPersonalizada.exceptions.DomainException;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	private Date checkIn;
	private Date checkOut;
	private int roomNumber;
	
	public Reservation() {}
	public Reservation(int roomNumber ,Date checkIn, Date checkOut) throws DomainException{
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.roomNumber = roomNumber;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		/* Macete para retornar o tempo entre o checkin e checkout
		 * primeiro a gnt pega o gitTime mas ele vai pegar o tempo
		 * em milisegundos, então a gente usa o timeunit para 
		 * converter os milisegundos em dias e assim pegar o tempo 
		 * total */
	}
	
	public void updateDate(Date checkIn, Date checkOut) throws DomainException {
		/* E como nosso método apenas vai lançar a excecao e vamos deixar para
		 * o metodo principal trata-la. Vamos dar o throws DomainException
		 * para dizer que nosso metodo vai propagar a excessao e não trata-la */
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
			/* Fazemos retornar com o "throw" um IllegalArgumentException que é qdo algum argumento
			 * inserido no método está errado. Aí o updateDate retorna essa mensagem de erro*/
		}
		if(!checkOut.after(checkIn)) {
			throw new IllegalArgumentException("Check-out date must be after check-in date");
		}
	}
	@Override
	public String toString() {
		return "Room " +
		roomNumber + ", checkin: " +
		sdf.format(checkIn) +
		", checkout: " + 
		sdf.format(checkOut) +
		", " + duration() + 
		" nights";
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	public Date checkOut() {
		return checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
		
}
