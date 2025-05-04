import java.util.ArrayList;
import java.util.List;

class Lcs {
    
    // Generate all subsequences of a string
    public static void generateSubsequences(String str, int index, String current, List<String> subsequences) {
        if (index == str.length()) {
            subsequences.add(current);
            return;
        }
        generateSubsequences(str, index + 1, current + str.charAt(index), subsequences);
        generateSubsequences(str, index + 1, current, subsequences);
    }
    
    // Find the longest common subsequence from two lists of subsequences
    public static String findLCS(List<String> subsequences1, List<String> subsequences2) {
        String lcs = "";
        for (String subseq1 : subsequences1) {
            for (String subseq2 : subsequences2) {
                if (subseq1.equals(subseq2) && subseq1.length() > lcs.length()) {
                    lcs = subseq1;
                }
            }
        }
        return lcs;
    }
    
    // Brute force solution to find the longest common subsequence
    public static int longestCommonSubsequence(String str1, String str2) {
        List<String> subsequences1 = new ArrayList<>();
        List<String> subsequences2 = new ArrayList<>();
        
        generateSubsequences(str1, 0, "", subsequences1);
        generateSubsequences(str2, 0, "", subsequences2);
        
        String lcs = findLCS(subsequences1, subsequences2);
        
        return lcs.length();
    }

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        System.out.println("Length of LCS (Brute Force): " + longestCommonSubsequence(str1, str2));
    }
}

