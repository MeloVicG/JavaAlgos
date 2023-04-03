//
//
//class Solution {
//
//    private static String ana = "anagram";
//    private static String target = "nagaram";
//
//    public static void main(String[] args) {
//        Solution anagram = new Solution();
//        anagram.isAnagram(ana, target);
//    }
//
//    public boolean isAnagram(String s, String t) {
//        // make a forloop^2
//        // create temp???
//        //
//
//        char temp;
//        String result;
//
////        for(int i = 0; i < s.length() - 1; i++){
////            for(int j = i+1; j < s.length() - 1; j++){
////                temp = s.charAt(i);
////                s.charAt(i) = s.charAt(j);
////                s.charAt(j) = temp;
////                // anagram
////                // nnagram
////                // naagram
////                result = s;
////
////                if(result == t){
////                    return true;
////                }
////
////            }
////        }
//
//
//
//        return false;
//    }
//}
//
//
//public class Filename {
//    private String fullPath;
//    private char pathSeparator,
//            extensionSeparator;
//
//    public Filename(String str, char sep, char ext) {
//        fullPath = str;
//        pathSeparator = sep;
//        extensionSeparator = ext;
//    }
//
//    public String extension() {
//        int dot = fullPath.lastIndexOf(extensionSeparator);
//        return fullPath.substring(dot + 1);
//    }
//
//    // gets filename without extension
//    public String filename() {
//        int dot = fullPath.lastIndexOf(extensionSeparator);
//        int sep = fullPath.lastIndexOf(pathSeparator);
//        return fullPath.substring(sep + 1, dot);
//    }
//
//    public String path() {
//        int sep = fullPath.lastIndexOf(pathSeparator);
//        return fullPath.substring(0, sep);
//    }
//}
//
//public class FilenameDemo {
//    public static void main(String[] args) {
//        final String FPATH = "/home/user/index.html";
//        Filename myHomePage = new Filename(FPATH, '/', '.');
//        System.out.println("Extension = " + myHomePage.extension());
//        System.out.println("Filename = " + myHomePage.filename());
//        System.out.println("Path = " + myHomePage.path());
//    }
//}