package com.brianteeter.codingtests;

import java.util.*;

public class CACodingTest2023
{
    /*
You are a developer for a university. Your current project is to develop a system for students to find courses they share with friends. The university has a system for querying courses students are enrolled in, returned as a list of (ID, course) pairs.

Write a function that takes in a collection of (student ID number, course name) pairs and returns, for every pair of students, a collection of all courses they share.


Sample Input:

enrollments1 = [
  ["58", "Linear Algebra"],
  ["94", "Art History"],
  ["94", "Operating Systems"],
  ["17", "Software Design"],
  ["58", "Mechanics"],
  ["58", "Economics"],
  ["17", "Linear Algebra"],
  ["17", "Political Science"],
  ["94", "Economics"],
  ["25", "Economics"],
  ["58", "Software Design"],
]

Sample Output (pseudocode, in any order):

find_pairs(enrollments1) =>
{
  "58,17": ["Software Design", "Linear Algebra"]
  "58,94": ["Economics"]
  "58,25": ["Economics"]
  "94,25": ["Economics"]
  "17,94": []
  "17,25": []
}



Additional test cases:

Sample Input:

enrollments2 = [
  ["0", "Advanced Mechanics"],
  ["0", "Art History"],
  ["1", "Course 1"],
  ["1", "Course 2"],
  ["2", "Computer Architecture"],
  ["3", "Course 1"],
  ["3", "Course 2"],
  ["4", "Algorithms"]
]


Sample output:

find_pairs(enrollments2) =>
{
  "1,0":[]
  "2,0":[]
  "2,1":[]
  "3,0":[]
  "3,1":["Course 1", "Course 2"]
  "3,2":[]
  "4,0":[]
  "4,1":[]
  "4,2":[]
  "4,3":[]
}

Sample Input:
enrollments3 = [
  ["23", "Software Design"],
  ["3", "Advanced Mechanics"],
  ["2", "Art History"],
  ["33", "Another"],
]


Sample output:

find_pairs(enrollments3) =>
{
  "23,3": []
  "23,2": []
  "23,33":[]
  "3,2":  []
  "3,33": []
  "2,33": []
}

All Test Cases:
find_pairs(enrollments1)
find_pairs(enrollments2)
find_pairs(enrollments3)

Complexity analysis variables:

n: number of student,course pairs in the input
s: number of students
c: total number of courses being offered (note: The number of courses any student can take is bounded by a small constant)

*/

    public static void main(String[] argv)
    {
        String[][] enrollments1 = {
                {"58", "Linear Algebra"},
                {"94", "Art History"},
                {"94", "Operating Systems"},
                {"17", "Software Design"},
                {"58", "Mechanics"},
                {"58", "Economics"},
                {"17", "Linear Algebra"},
                {"17", "Political Science"},
                {"94", "Economics"},
                {"25", "Economics"},
                {"58", "Software Design"}
        };

        String[][] enrollments2 = {
                {"0", "Advanced Mechanics"},
                {"0", "Art History"},
                {"1", "Course 1"},
                {"1", "Course 2"},
                {"2", "Computer Architecture"},
                {"3", "Course 1"},
                {"3", "Course 2"},
                {"4", "Algorithms"}
        };

        String[][] enrollments3 = {
                {"23", "Software Design"},
                {"3", "Advanced Mechanics"},
                {"2", "Art History"},
                {"33", "Another"},
        };

        CACodingTest2023 solution = new CACodingTest2023();
        solution.findSharedClasses(enrollments1);
    }

    public Map<List<String>, List<String>> findSharedClasses(String[][] studentEnrollments)
    {
        HashMap<String, String> studentClasses = new HashMap<>();
        HashMap<List<String>, List<String>> sharedClassesResults = new HashMap<List<String>, List<String>>();

        // Get all the students:
        List<String> studentIds = new ArrayList<String>();

        for (int i = 0; i < studentEnrollments.length; i++)
        {
            String nextStudent = studentEnrollments[i][0];

            if (studentIds.contains(nextStudent) != true)
            {
                studentIds.add(nextStudent);
            }
        }

        System.out.println("studentIds: " + studentIds.toString());

        // Get all the student pairs:
        for (int i = 0; i < studentIds.size(); i++)
        {

            for (int j = i + 1; j < studentIds.size(); j++)
            {
                List<String> nextPair = new ArrayList<String>();

                nextPair.add(studentIds.get(i));
                nextPair.add(studentIds.get(j));

                sharedClassesResults.put(nextPair, new ArrayList<String>());
            }
        }

        System.out.println("sharedClassesResults: " + sharedClassesResults.toString());


        // TODO: Step through each student pair:
        Set<List<String>> allPairs = sharedClassesResults.keySet();

        List<String> student1Classes = new ArrayList<String>();
        List<String> student2Classes = new ArrayList<String>();

        for (int i = 0; i < allPairs.length(); i++)
        {
            String[] nextPair = allPairs[i];

            // Find student 1's classes:
            // Find student 2's classes:
            for (int j = 0; j < studentEnrollments.length(); j++)
            {
                if (studentEnrollments[i][0].equals(nextPair[0]))
                {
                    student1Classes.add(tudentEnrollments[i][1]);
                }
                if (studentEnrollments[i][0].equals(nextPair[1]))
                {
                    student2Classes.add(tudentEnrollments[i][1]);
                }
            }

            System.out.println("nextPair: " + nextPair);
            System.out.println("student1Classes: " + student1Classes);
            System.out.println("student2Classes: " + student1Classes);

            // Find intersection:

        }

        return sharedClassesResults;
    }
}

