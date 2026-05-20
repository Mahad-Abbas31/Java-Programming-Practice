public class stringMethods {
    public static void main(String[] args){
        // ===============================
// JAVA STRING METHODS
// ===============================

// length()
// Returns length of string
// Example: str.length()

// charAt(int index)
// Returns character at specific index
// Example: str.charAt(0)

// substring(int beginIndex)
// Returns substring from beginIndex to end
// Example: str.substring(2)

// substring(int beginIndex, int endIndex)
// Returns substring from beginIndex to endIndex-1
// Example: str.substring(1, 4)

// equals(Object obj)
// Compares two strings (case-sensitive)
// Example: str1.equals(str2)

// equalsIgnoreCase(String anotherString)
// Compares strings ignoring case
// Example: str1.equalsIgnoreCase(str2)

// compareTo(String anotherString)
// Lexicographically compares two strings
// Example: str1.compareTo(str2)

// compareToIgnoreCase(String str)
// Compares strings ignoring case
// Example: str1.compareToIgnoreCase(str2)

// contains(CharSequence s)
// Checks if string contains specified sequence
// Example: str.contains("abc")

// startsWith(String prefix)
// Checks if string starts with prefix
// Example: str.startsWith("He")

// endsWith(String suffix)
// Checks if string ends with suffix
// Example: str.endsWith("ing")

// indexOf(int ch)
// Returns first occurrence index of character
// Example: str.indexOf('a')

// indexOf(String str)
// Returns first occurrence index of substring
// Example: str.indexOf("java")

// lastIndexOf(int ch)
// Returns last occurrence index of character
// Example: str.lastIndexOf('a')

// lastIndexOf(String str)
// Returns last occurrence index of substring
// Example: str.lastIndexOf("java")

// isEmpty()
// Checks if string is empty
// Example: str.isEmpty()

// isBlank()  // Java 11+
// Checks if string is empty or contains only spaces
// Example: str.isBlank()

// toUpperCase()
// Converts string to uppercase
// Example: str.toUpperCase()

// toLowerCase()
// Converts string to lowercase
// Example: str.toLowerCase()

// trim()
// Removes spaces from start and end
// Example: str.trim()

// strip()  // Java 11+
// Removes leading and trailing whitespaces
// Example: str.strip()

// stripLeading()  // Java 11+
// Removes leading spaces
// Example: str.stripLeading()

// stripTrailing()  // Java 11+
// Removes trailing spaces
// Example: str.stripTrailing()

// replace(char oldChar, char newChar)
// Replaces characters
// Example: str.replace('a', 'b')

// replace(CharSequence target, CharSequence replacement)
// Replaces substring
// Example: str.replace("java", "cpp")

// replaceFirst(String regex, String replacement)
// Replaces first matching substring
// Example: str.replaceFirst("a", "b")

// replaceAll(String regex, String replacement)
// Replaces all matching substrings
// Example: str.replaceAll("a", "b")

// split(String regex)
// Splits string into array
// Example: str.split(" ")

// concat(String str)
// Concatenates strings
// Example: str.concat(" World")

// join(CharSequence delimiter, CharSequence... elements)
// Joins strings with delimiter
// Example: String.join("-", "A", "B", "C")

// matches(String regex)
// Checks regex match
// Example: str.matches("[A-Z]+")

// repeat(int count)  // Java 11+
// Repeats string count times
// Example: str.repeat(3)

// intern()
// Returns canonical representation of string
// Example: str.intern()

// toCharArray()
// Converts string to character array
// Example: str.toCharArray()

// getBytes()
// Converts string to byte array
// Example: str.getBytes()

// valueOf(dataType)
// Converts different data types to string
// Example: String.valueOf(123)

// format(String format, Object... args)
// Formats string
// Example: String.format("%d", 10)

// copyValueOf(char[] data)
// Converts char array to string
// Example: String.copyValueOf(arr)

// lines()  // Java 11+
// Returns stream of lines
// Example: str.lines()

// codePointAt(int index)
// Returns Unicode at index
// Example: str.codePointAt(0)

// codePointBefore(int index)
// Returns Unicode before index
// Example: str.codePointBefore(1)

// codePointCount(int beginIndex, int endIndex)
// Counts Unicode code points
// Example: str.codePointCount(0, 5)

// offsetByCodePoints(int index, int codePointOffset)
// Returns offset index
// Example: str.offsetByCodePoints(0, 2)

// contentEquals(CharSequence cs)
// Compares content
// Example: str.contentEquals("Hello")

// regionMatches(...)
// Compares regions of strings
// Example: str.regionMatches(0, "Hello", 0, 2)

// subSequence(int start, int end)
// Returns subsequence
// Example: str.subSequence(1, 4)

// hashCode()
// Returns hash code of string
// Example: str.hashCode()

// toString()
// Returns string itself
// Example: str.toString()

// indent(int n)  // Java 12+
// Adjusts indentation
// Example: str.indent(4)

// translateEscapes()  // Java 15+
// Translates escape sequences
// Example: str.translateEscapes()

// transform(Function)
// Applies transformation function
// Example: str.transform(s -> s.toUpperCase())

// formatted(Object... args)  // Java 15+
// Formats string
// Example: "%s %d".formatted("Age", 20)

// describeConstable()
// Returns optional containing string
// Example: str.describeConstable()

// resolveConstantDesc(MethodHandles.Lookup lookup)
// Resolves constant description
// Advanced internal use

// ===============================
// COMMONLY USED STRING METHODS
// ===============================
// length()
// charAt()
// substring()
// equals()
// equalsIgnoreCase()
// compareTo()
// contains()
// startsWith()
// endsWith()
// indexOf()
// lastIndexOf()
// toUpperCase()
// toLowerCase()
// trim()
// replace()
// split()
// concat()
// isEmpty()
// isBlank()
// matches()
// repeat()
    }
}
