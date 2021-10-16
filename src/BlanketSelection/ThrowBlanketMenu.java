package BlanketSelection;

public class ThrowBlanketMenu {
	
ThrowBlanket[] throwBlanketsMenu;

	
	public ThrowBlanketMenu() {
		throwBlanketsMenu = new ThrowBlanket[3];
		throwBlanketsMenu[0] = new NestWell();
		throwBlanketsMenu[1] = new Studio3B();
		throwBlanketsMenu[2] = new WildSage();

}
	public Iterator createIterator() {
		return new ThrowBlanketIterator(throwBlanketsMenu);
	}
}
