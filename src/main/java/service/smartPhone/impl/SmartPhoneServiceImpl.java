package service.smartPhone.impl;

import model.smartPhone.SmartPhone;
import repository.smartPhone.SmartPhoneRepository;
import repository.smartPhone.impl.SmartPhoneRepositoryImpl;
import service.smartPhone.SmartPhoneService;

import java.util.List;

public class SmartPhoneServiceImpl implements SmartPhoneService {
    private SmartPhoneRepository repository = new SmartPhoneRepositoryImpl();
    @Override
    public SmartPhone findSmartPhone(int id) {
        return repository.findById(id);
    }

    @Override
    public SmartPhone saveSmartPhone(SmartPhone smartPhone) {
        return repository.save(smartPhone);
    }

    @Override
    public SmartPhone deleteSmartPhone(SmartPhone smartPhone) {
        return repository.delete(smartPhone);
    }

    @Override
    public SmartPhone updateSmartPhone(SmartPhone smartPhone) {
        return repository.update(smartPhone);
    }

    @Override
    public List<SmartPhone> getAllSmartPhones() {
        return repository.getAll();
    }
}
