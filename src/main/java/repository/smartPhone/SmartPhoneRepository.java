package repository.smartPhone;

import Exeptions.smartPhone.SmartPhoneDeleteException;
import Exeptions.smartPhone.SmartPhoneUpdateException;
import model.smartPhone.SmartPhone;

import java.util.List;

public interface SmartPhoneRepository {
    SmartPhone save(SmartPhone smartPhone);
    SmartPhone update(SmartPhone smartPhone) throws SmartPhoneUpdateException;
    SmartPhone delete(SmartPhone smartPhone) throws SmartPhoneDeleteException;
    SmartPhone findById(int id);
    List<SmartPhone> getAll();
}
