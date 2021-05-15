package service.smartPhone;

import model.smartPhone.SmartPhone;

import java.util.List;

public interface SmartPhoneService {
    SmartPhone findSmartPhone(int id);
    SmartPhone saveSmartPhone(SmartPhone smartPhone);
    SmartPhone deleteSmartPhone(SmartPhone smartPhone);
    SmartPhone updateSmartPhone(SmartPhone smartPhone);
    List<SmartPhone> getAllSmartPhones();
}
