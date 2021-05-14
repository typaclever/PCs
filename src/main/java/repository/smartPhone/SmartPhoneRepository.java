package repository.smartPhone;

import model.smartPhone.SmartPhone;

public interface SmartPhoneRepository {
    SmartPhone save(SmartPhone smartPhone);
    SmartPhone update(SmartPhone smartPhone);
    SmartPhone delete(SmartPhone smartPhone);
    SmartPhone findById(int id);
}
