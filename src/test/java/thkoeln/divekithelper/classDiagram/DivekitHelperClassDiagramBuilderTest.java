package thkoeln.divekithelper.classDiagram;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import static thkoeln.divekithelper.classDiagram.DivekitHelperClassDiagramBuilder.*;

public class DivekitHelperClassDiagramBuilderTest {
    @Test
    void eo02Passing(){
        assertEquals(true,
                classDiagram( new ClassDiagramTest("src/main/java/thkoeln/divekithelper/mock/diagrams/E02modifiedPassing.uxf", "src/main/java/thkoeln/divekithelper/mock/diagrams/E02Solution.uxf") )
                    .missingClasses()
                        .message(0, "A Class is missing.")
                        .message(1, "_CLASS_ is missing.")
                    .combine()
                    .wrongClasses()
                        .message(0, "A Class in unnecessary.")
                        .message(1, "_CLASS_ is unnecessary.")
                    .combine()
                    .mismatch("src/main/java/thkoeln/divekithelper/mock/diagrams/Glossary.md","Geschäftsobjekt")
                        .message(0, "A Class is only present in the glossary or the diagram but not in both.")
                        .message(1, "_CLASS_ is only present in the glossary or the diagram but not in both.")
                    .combine()
                    .classWrongAttributes()
                        .message(0, "A Class has wrong Attributes.")
                        .message(1, "_CLASS_ has wrong Attributes.")
                    .combine()
                    .missingRelations()
                        .message(0, "A Relation is missing.")
                        .message(1, "_RELATION_ is missing.")
                    .combine()
                    .wrongRelations()
                        .message(0, "A Relation is wrong.")
                        .message(1, "_RELATION_ is wrong.")
                    .combine()
                    .illegalElements()
                        .message(0, "A illegal Element is present.")
                        .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                    .test("E02Passing", "Class-Diagram Test")
                );
    }

    @Test
    void eo02Failing(){
        assertEquals(false,
                classDiagram( new ClassDiagramTest("src/main/java/thkoeln/divekithelper/mock/diagrams/E02modifiedFailing.uxf", "src/main/java/thkoeln/divekithelper/mock/diagrams/E02Solution.uxf") )
                        .missingClasses()
                            .message(0, "A Class is missing.")
                            .message(1, "_CLASS_ is missing.")
                        .combine()
                        .wrongClasses()
                            .message(0, "A Class in unnecessary.")
                            .message(1, "_CLASS_ is unnecessary.")
                        .combine()
                        .mismatch("src/main/java/thkoeln/divekithelper/mock/diagrams/Glossary.md","Geschäftsobjekt")
                            .message(0, "A Class is only present in the glossary or the diagram but not in both.")
                            .message(1, "_CLASS_ is only present in the glossary or the diagram but not in both.")
                        .combine()
                        .classWrongAttributes()
                            .message(0, "A Class has wrong Attributes.")
                            .message(1, "_CLASS_ has wrong Attributes.")
                        .combine()
                        .missingRelations()
                            .message(0, "A Relation is missing.")
                            .message(1, "_RELATION_ is missing.")
                        .combine()
                        .wrongRelations()
                            .message(0, "A Relation is wrong.")
                            .message(1, "_RELATION_ is wrong.")
                        .combine()
                        .illegalElements()
                            .message(0, "A illegal Element is present.")
                            .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                        .test("E02Failing", "Class-Diagram Test")
        );
    }

    @Test
    void eo02Failing2(){
        assertEquals(false,
                classDiagram( new ClassDiagramTest("src/main/java/thkoeln/divekithelper/mock/diagrams/E02modifiedFailing2.uxf", "src/main/java/thkoeln/divekithelper/mock/diagrams/E02Solution.uxf") )
                        .missingClasses()
                            .message(0, "A Class is missing.")
                            .message(1, "_CLASS_ is missing.")
                        .combine()
                        .wrongClasses()
                            .message(0, "A Class in unnecessary.")
                            .message(1, "_CLASS_ is unnecessary.")
                        .combine()
                        .mismatch("src/main/java/thkoeln/divekithelper/mock/diagrams/Glossary.md","Geschäftsobjekt")
                            .message(0, "A Class is only present in the glossary or the diagram but not in both.")
                            .message(1, "_CLASS_ is only present in the glossary or the diagram but not in both.")
                        .combine()
                        .classWrongAttributes()
                            .message(0, "A Class has wrong Attributes.")
                            .message(1, "_CLASS_ has wrong Attributes.")
                        .combine()
                        .missingRelations()
                            .message(0, "A Relation is missing.")
                            .message(1, "_RELATION_ is missing.")
                        .combine()
                        .wrongRelations()
                            .message(0, "A Relation is wrong.")
                            .message(1, "_RELATION_ is wrong.")
                        .combine()
                        .illegalElements()
                            .message(0, "A illegal Element is present.")
                            .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                        .test("E02Failing2", "Class-Diagram Test")
        );
    }

    @Test
    void eo02FinalFailing(){

        String e02 = "src/main/java/thkoeln/divekithelper/mock/diagrams/E02FinalModifiedFailing.uxf";
        String e02Solution = "src/main/java/thkoeln/divekithelper/mock/diagrams/E02FinalSolution.uxf";

        assertEquals(false,
                classDiagram( new ClassDiagramTest( e02, e02Solution) )
                        .missingClasses()
                            .message(0, "A Class is missing.")
                            .message(1, "_CLASS_ is missing.")
                        .combine()
                        .wrongClasses()
                            .message(0, "A Class in unnecessary.")
                            .message(1, "_CLASS_ is unnecessary.")
                        .combine()
                        .classWrongAttributes()
                            .message(0, "A Class has wrong Attributes.")
                            .message(1, "_CLASS_ has wrong Attributes.")
                        .combine()
                        .missingRelations()
                            .message(0, "A Relation is missing.")
                            .message(1, "_RELATION_ is missing.")
                        .combine()
                        .wrongRelations()
                            .message(0, "A Relation is wrong.")
                            .message(1, "_RELATION_ is wrong.")
                        .combine()
                        .illegalElements()
                            .message(0, "A illegal Element is present.")
                            .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                        .test("E02FinalFailing", "Class-Diagram Test")
        );
    }


    @Test
    void eo02WrongResourcePath(){
        //Wrong User-Diagram Path
        assertEquals(false,
                classDiagram( new ClassDiagramTest("src/main/java/thkoeln/divekithelper/mock/diagrams/E03modifiedPassing.uxf", "src/main/java/thkoeln/divekithelper/mock/diagrams/E02Solution.uxf") )
                        .missingClasses()
                            .message(0, "A Class is missing.")
                            .message(1, "_CLASS_ is missing.")
                        .combine()
                        .wrongClasses()
                            .message(0, "A Class in unnecessary.")
                            .message(1, "_CLASS_ is unnecessary.")
                        .combine()
                        .mismatch("src/main/java/thkoeln/divekithelper/mock/diagrams/Glossary.md","Geschäftsobjekt")
                            .message(0, "A Class is only present in the glossary or the diagram but not in both.")
                            .message(1, "_CLASS_ is only present in the glossary or the diagram but not in both.")
                        .combine()
                        .classWrongAttributes()
                            .message(0, "A Class has wrong Attributes.")
                            .message(1, "_CLASS_ has wrong Attributes.")
                        .combine()
                        .missingRelations()
                            .message(0, "A Relation is missing.")
                            .message(1, "_RELATION_ is missing.")
                        .combine()
                        .wrongRelations()
                            .message(0, "A Relation is wrong.")
                            .message(1, "_RELATION_ is wrong.")
                        .combine()
                        .illegalElements()
                            .message(0, "A illegal Element is present.")
                            .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                        .test("E02Failing User-Diagram", "Class-Diagram Test")
        );
        //Wrong Solution-Diagram Path
        assertEquals(false,
                classDiagram( new ClassDiagramTest("src/main/java/thkoeln/divekithelper/mock/diagrams/E02modifiedPassing.uxf", "src/main/java/thkoeln/divekithelper/mock/diagrams/E03Solution.uxf") )
                        .missingClasses()
                            .message(0, "A Class is missing.")
                            .message(1, "_CLASS_ is missing.")
                        .combine()
                        .wrongClasses()
                            .message(0, "A Class in unnecessary.")
                            .message(1, "_CLASS_ is unnecessary.")
                        .combine()
                        .mismatch("src/main/java/thkoeln/divekithelper/mock/diagrams/Glossary.md","Geschäftsobjekt")
                            .message(0, "A Class is only present in the glossary or the diagram but not in both.")
                            .message(1, "_CLASS_ is only present in the glossary or the diagram but not in both.")
                        .combine()
                        .classWrongAttributes()
                            .message(0, "A Class has wrong Attributes.")
                            .message(1, "_CLASS_ has wrong Attributes.")
                        .combine()
                        .missingRelations()
                            .message(0, "A Relation is missing.")
                            .message(1, "_RELATION_ is missing.")
                        .combine()
                        .wrongRelations()
                            .message(0, "A Relation is wrong.")
                            .message(1, "_RELATION_ is wrong.")
                        .combine()
                        .illegalElements()
                            .message(0, "A illegal Element is present.")
                            .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                        .test("E02Failing Solution-Diagram", "Class-Diagram Test")
        );
        //Wrong Glossary Path
        assertEquals(false,
                classDiagram( new ClassDiagramTest("src/main/java/thkoeln/divekithelper/mock/diagrams/E02modifiedPassing.uxf", "src/main/java/thkoeln/divekithelper/mock/diagrams/E02Solution.uxf") )
                        .missingClasses()
                            .message(0, "A Class is missing.")
                            .message(1, "_CLASS_ is missing.")
                        .combine()
                        .wrongClasses()
                            .message(0, "A Class in unnecessary.")
                            .message(1, "_CLASS_ is unnecessary.")
                        .combine()
                        .mismatch("src/main/java/thkoeln/divekithelper/mock/diagrams/lossary.md","Geschäftsobjekt")
                            .message(0, "A Class is only present in the glossary or the diagram but not in both.")
                            .message(1, "_CLASS_ is only present in the glossary or the diagram but not in both.")
                        .combine()
                        .classWrongAttributes()
                            .message(0, "A Class has wrong Attributes.")
                            .message(1, "_CLASS_ has wrong Attributes.")
                        .combine()
                        .missingRelations()
                            .message(0, "A Relation is missing.")
                            .message(1, "_RELATION_ is missing.")
                        .combine()
                        .wrongRelations()
                            .message(0, "A Relation is wrong.")
                            .message(1, "_RELATION_ is wrong.")
                        .combine()
                        .illegalElements()
                            .message(0, "A illegal Element is present.")
                            .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                        .test("E02Failing Glossary", "Class-Diagram Test")
        );
        //Wrong Glossary Column-Name
        assertEquals(false,
                classDiagram( new ClassDiagramTest("src/main/java/thkoeln/divekithelper/mock/diagrams/E02modifiedPassing.uxf", "src/main/java/thkoeln/divekithelper/mock/diagrams/E02Solution.uxf") )
                        .missingClasses()
                            .message(0, "A Class is missing.")
                            .message(1, "_CLASS_ is missing.")
                        .combine()
                        .wrongClasses()
                            .message(0, "A Class in unnecessary.")
                            .message(1, "_CLASS_ is unnecessary.")
                        .combine()
                        .mismatch("src/main/java/thkoeln/divekithelper/mock/diagrams/Glossary.md","G")
                            .message(0, "A Class is only present in the glossary or the diagram but not in both.")
                            .message(1, "_CLASS_ is only present in the glossary or the diagram but not in both.")
                        .combine()
                        .classWrongAttributes()
                            .message(0, "A Class has wrong Attributes.")
                            .message(1, "_CLASS_ has wrong Attributes.")
                        .combine()
                        .missingRelations()
                            .message(0, "A Relation is missing.")
                            .message(1, "_RELATION_ is missing.")
                        .combine()
                        .wrongRelations()
                            .message(0, "A Relation is wrong.")
                            .message(1, "_RELATION_ is wrong.")
                        .combine()
                        .illegalElements()
                            .message(0, "A illegal Element is present.")
                            .message(1, "Class-Diagrams do not allow _ELEMENT_.")
                        .test("E02Failing Glossary Column-Name", "Class-Diagram Test")
        );
    }

}
