@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("checkIsAdult should return true if the user is 18 or older", true, isAdult); 
}