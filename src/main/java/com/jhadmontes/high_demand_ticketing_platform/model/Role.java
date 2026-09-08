package com.jhadmontes.high_demand_ticketing_platform.model;

public enum Role {
    CUSTOMER,
    ADMIN
}
//Por qué un Enum: En lugar de dejar que cualquiera escriba un texto libre
// (lo cual podría causar errores si alguien escribe "admin" y otro "ADMINISTRADOR"),
// un Enum restringe las opciones estrictamente a los valores definidos.