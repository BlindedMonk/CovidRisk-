//this goes on top
int finalScore = 0;
String Male; 
String Female;
int Age; 
boolean RespitoryIllness;
int exerciseHours;
boolean handHygiene;
boolean Mask;
int familyMembers;
int levelOfActivity;
boolean Outside;
int Minutes;

//gender
if(user == Male)
{
    finalScore = finalScore + 3;
}
else if
{
    finalScore = finalScore + 1;
}
else
{
    finalScore = finalScore;
}

//age
if(Age >= 80)
{
    finalScore = finalScore + 10;
}
else if(Age >= 60 && Age <= 79)
{
    finalScore = finalScore + 8;
}
else if(Age >= 40 && Age <= 59)
{
    finalScore = finalScore + 6;
}
else if(Age >= 20 && Age <= 39)
{
    finalScore = finalScore + 4;
}
else if(Age >= 15 && Age <= 14)
{
    finalScore = finalScore + 1;
}
else
{
    finalScore = finalScore
}

//Resp. Illness
if(RespitoryIllness == true)
{
    finalScore = finalScore + 10;
}
else
{
    finalScore = finalScore;
}

//Exercise
if(exerciseHours >= 0 && exerciseHours <= 10)
{
    finalScore = finalScore + 10;
}
else if(exerciseHours >= 11 && exerciseHours <= 149)
{
    finalScore = finalScore + 2;
}
else
{
    finalScore = finalScore;
}

//Hand Hygiene
if(handHygiene == false)
{
    finalScore = finalScore + 10;
} 
else
{
    finalScore = finalScore;
}

//Mask
if(Mask == false)
{
    finalScore = finalScore + 10;
} 
else
{
    finalScore = finalScore;
}

//Family Members
if(familyMembers > 0 && familyMembers <= 5)
{
    finalScore = finalScore + 2;
}
else if(familyMembers > 5)
{
    finalScore = finalScore + 5;
}
else
{
    finalScore = finalScore;
}

//Level of Activity
if(levelOfActivity == 0)
{
    finalScore = finalScore + 1;
}
if(levelOfActivity == 1)
{
    finalScore = finalScore + 5;
}
else
{
    finalScore = finalScore + 10;
}

//Inside/Outside
if(Outside == true)
{
    finalScore = finalScore + 1
}
else
{
    finalScore = finalScore + 10;
}

//Minutes spent indoors
if(Minutes > 0 && Minutes <= 10)
{
    finalScore = finalScore + 1;
}
else if(Minutes >= 10 && Minutes <= 60)
{
    finalScore = finalScore + 5;
}
else if(Minutes >= 60 && Minutes <= 120)
{
    finalScore = finalScore + 10;
}
else
{
    finalScore = finalScore + 15;
}

//final score calculation
if(finalScore >= 4 && finalScore <= 24)
{
    System.out.println("risk is low");
}
else if(finalScore >= 25 && finalScore <= 50)
{
    System.out.println("risk is high");
}
else
{
    System.out.println("risk is very high");
}