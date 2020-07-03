package com.company.Persona;

import com.company.Equipment.Armor;
import com.company.Equipment.Equipment;
import com.company.Equipment.Weapon;
import com.company.Mechanic.Place;

import java.util.ArrayList;

public class Persona {
    //Personal Information
    public String name, eyeColor, hairColor, starSign, specials;
    public Race race;
    public Integer age, gender, weight, height, siblings;
    public Place birthPlace;
    //Occupation
    public Occupation actualOccupation = new Occupation();
    public Occupation previousOccupation = new Occupation();
    //Cash
    public Integer cash1, cash2, cash3;
    //Atributes
    public Statistics statistics = new Statistics();
    public Statistics growthStatistics = new Statistics();
    public Statistics actualStatistics = new Statistics();
    //ArmorPoints
    public Integer headArmor, rightHandArmor, leftHandArmor, bodyArmor, rightLegArmor, leftLegArmor;
    //Equipment
    public ArrayList<Equipment> backpack = new ArrayList<>();
    public ArrayList<Weapon> weapons = new ArrayList<>();
    public ArrayList<Armor> armors = new ArrayList<>();
    //Skills
    public ArrayList<Ability> abilities = new ArrayList<>();
    public Skills skills = new Skills();
}
