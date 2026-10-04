# Assignment3_SDP
# Assignment 3 | Bridge Pattern

**Name:** YERTORE OMIRTAYEV
**Group:** SE-2530
**Topic:** C 
**Repository URL:** [https://github.com/erekenoob/Assignment3_SDP]
**Base Commit Hash:** 54d41459640f58a3d56c7cf3c658371a454b7e77

## Role Map

| Role | Class Name | Source Path |
| :--- | :--- | :--- |
| Abstraction | `Report` | `src/reports/Report.java` |
| A1 | `AttendanceReport` | `src/reports/AttendanceReport.java` |
| A2 | `GradeReport` | `src/reports/GradeReport.java` |
| Implementor | `Formatter` | `src/reports/Formatter.java` |
| I1 | `TextFormatter` | `src/reports/TextFormatter.java` |
| I2 | `HtmlFormatter` | `src/reports/HtmlFormatter.java` |
| I3 (Extension) | `MarkdownFormatter`| `src/reports/MarkdownFormatter.java` |
| Client | `Main` | `src/Main.java` |

**Key code locations:**
* Bridge field: `formatter` in `src/reports/Report.java`
* execute(): `execute()` in `src/reports/Report.java`
* setImplementation(...): `setImplementation(Formatter formatter)` in `src/reports/Report.java`
* T5 runtime switch check: `Main.java`

## Build and Run Commands
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
java -cp out Main

## Expected Outcomes
* T1-T4: PASS (Correct Attendance and Grade reports with Text and HTML formatters)
* T5: PASS sameObject=true | stateUnchanged=true
* T6-T7: PASS (Correct reports with MarkdownFormatter)
* SUMMARY: 7/7 PASS
