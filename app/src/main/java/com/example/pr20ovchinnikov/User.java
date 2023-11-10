package com.example.pr20ovchinnikov;
public class User {
    public String  Name, LastName, MiddleName, Height, Weight, PhoneNumber;
    public String ID;
    public User(){

    }
    public User(String ID,String Name, String LastName, String MiddleName, String Height, String Weight, String PhoneNumber)
    {
        this.ID = ID;
        this.Name = Name;
        this.LastName = LastName;
        this.MiddleName = MiddleName;
        this.Height = Height;
        this.Weight = Weight;
        this.PhoneNumber = PhoneNumber;
    }
}
