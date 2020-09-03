package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.Person;
import edu.javacourse.studentorder.domain.register.CityRegisterResponse;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.exception.TransportExeption;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";
    private static final String ERROR_T_1 = "1003";
    private static final String ERROR_T_2 = "2003";

    public CityRegisterResponse checkerPerson(Person person)
            throws CityRegisterException, TransportExeption {
        CityRegisterResponse res = new CityRegisterResponse();

        if (person instanceof Adult) {
            System.out.println("ADULT");
            Adult t = (Adult) person;
            String ps = t.getPassportSerial();
            if (ps.equals(GOOD_1) || ps.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemporal(false);

            }
            if (ps.equals(BAD_1) || ps.equals(BAD_2)) {
                res.setTemporal(false);

            }

            if (ps.equals(ERROR_1) || ps.equals(ERROR_2)) {
                CityRegisterException ex =
                        new CityRegisterException("1", "GRN ERROR" + ps);
                throw ex;
            }
            if (ps.equals(ERROR_T_1) || ps.equals(ERROR_T_2)) {
                TransportExeption ex =
                        new TransportExeption("Transport ERROR");
                throw ex;
            }
        }
        if (person instanceof Child) {
            res.setExisting(true);
            res.setTemporal(true);
        }

        System.out.println(res);

        return res;
    }


}
