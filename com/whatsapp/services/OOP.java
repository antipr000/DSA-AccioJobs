package com.whatsapp.services;

class Engineer{
    char cgpa;
}

class ComputerEngineer extends Engineer{
    int dbmsScore;
    int osScore;
}

class MechanicalEngineer extends Engineer{
    int mechanicsScore;
    int autoCADScore;
}

class FrontendEngineer extends ComputerEngineer{
    int uiScore;
}

class DevopsEngineer extends ComputerEngineer{
    int ciCDScore;
}

class BackendEngineer extends ComputerEngineer{
    int djangoScore;
}


public class OOP {
    
}
