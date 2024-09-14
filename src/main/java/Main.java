import arraystring.acronymofwords.AcronymOfWords;
import arraystring.arrayconditions.ArrayConditions;
import arraystring.arrayfrompermutation.ArrayFromPermutation;
import arraystring.arthmeticprogression.ArithmeticProgression;
import arraystring.balancedstring.BalancedString;
import arraystring.besttimestock.BestTimeStock;
import arraystring.candies.Candies;
import arraystring.canplaceflowers.CanPlaceFlowers;
import arraystring.chackifwordsoccurprefix.CheckIfWordsOccurPrefix;
import arraystring.checkifsentenceispangram.CheckIfSentenceIsPangram;
import arraystring.checktwostingsarraysequivalent.CheckIfTwoStringArraysAreEquivalent;
import arraystring.concatenationofarray.ArrayConcatenation;
import arraystring.consistentstring.ConsistentString;
import arraystring.countingwordsprefix.CountingWordsPrefix;
import arraystring.defangingipaddress.DefangingIPAddress;
import arraystring.destinationcity.DestinationCity;
import arraystring.differencesumanddigitsum.SumAndDigitSum;
import arraystring.employeestarget.EmployeesTarget;
import arraystring.faultykeyboard.FaultyKeyboard;
import arraystring.finalvalue.FinalValue;
import arraystring.finddifferences.FindTheDifference;
import arraystring.findindex.FindIndexOfFirstString;
import arraystring.findwordscontainingcharacter.FindWordsContainingCharacter;
import arraystring.fizzbuzz.FizzBuzz;
import arraystring.goalparserinterpretation.GoalParserInterpretation;
import arraystring.howmanynumbersaresmaller.HowManyNumbersAreSmaller;
import arraystring.jewelsandstones.JewelsAndStones;
import arraystring.lengthoflasword.LengthLastWord;
import arraystring.majorityelement.MajorityElement;
import arraystring.maximumingeneratedarray.GetMaximumInGeneratedArray;
import arraystring.maxnumberofwords.MaximumNumberOfWords;
import arraystring.maxnumberstringpairs.MaxNumberOfStringPairs;
import arraystring.mergesortedarray.MergeSortedArray;
import arraystring.mergestringsalternately.MergeStringsAlternately;
import arraystring.middleindex.MiddleIndex;
import arraystring.minimumnumbergame.MinNumberGame;
import arraystring.minimumnumberofdecibinary.MinNumberOfDeciBinary;
import arraystring.minoperationmoveballs.MinOperationMoveBalls;
import arraystring.movezeroes.MoveZeroes;
import arraystring.numberofgoodpairs.NumberOfGoodPairs;
import arraystring.pascalstriangle.PascalsTriangle;
import arraystring.pascalstriangleII.PascalsTriangleTwo;
import arraystring.permutationdifference.PermutationDifference;
import arraystring.pivotindex.PivotIndex;
import arraystring.removeduplicates.RemoveDuplicates;
import arraystring.removeelement.RemoveElement;
import arraystring.reverseprefixword.ReversePrefixWord;
import arraystring.reversestring.ReverseString;
import arraystring.reversewords.ReverseWordsInString;
import arraystring.runningsum.RunningSum;
import arraystring.shufflearray.ShuffleArray;
import arraystring.signproductarray.SignProductArray;
import arraystring.sortingthesentence.SortingTheSentence;
import arraystring.sortpeople.SortThePeople;
import arraystring.sortstudents.SortStudents;
import arraystring.splitarray.SplitArray;
import arraystring.spreadstonesovergrid.NumberOfLaserBeams;
import arraystring.stringscore.StringScore;
import arraystring.sumdifferences.SumDifferences;
import arraystring.timetocollectgarbage.TimeToCollectGarbage;
import arraystring.tolowercase.ToLowerCase;
import arraystring.truncatesentence.TruncateSentence;
import arraystring.validanagram.ValidAnagram;
import arraystring.wordpattern.WordPattern;
import bitmanipulation.singlenumber.SingleNumber;
import divisiblebythree.DivisibleByThree;
import hashtable.decodemessage.DecodeTheMessage;
import hashtable.findcommonelementsbetweentwoarrays.FindCommonElements;
import hashtable.grouppeople.GroupPeople;
import math.countnumbers.CountNumbers;
import math.countoddnumbers.CountOddNumbers;
import math.distinctintegers.DistinctIntegers;
import math.divisiblenondivisiblesum.DivisibleNonDivisibleSum;
import math.harshadnumber.HarshadNumber;
import math.makearrayequal.MakeArrayEqual;
import math.maxnumber.MaxNumber;
import math.minsum.MinSum;
import math.numberofcoins.NumberOfCoins;
import math.numberofmatches.NumberOfMatches;
import math.palindromenumber.PalindromeNumber;
import math.pivotinteger.PivotInteger;
import math.plusone.PlusOne;
import math.productandsum.ProductAndSum;
import math.reducenumbertozero.ReduceNumberToZero;
import math.smallestevenmultiple.SmallestEvenMultiple;
import math.summultiples.SumMultiples;
import math.winnercirculargame.WinnerCircularGame;
import matrix.matrixdiagonalsum.MatrixDiagonalSum;
import matrix.minstepstomakeanagram.MinStepsToMakeAnagram;
import matrix.richestcustomerwealth.RichestCustomerWealth;
import twopointers.countnumberoffairpairs.CountNumberOfFairPairs;
import twopointers.countpairssumlessthantarget.CountPairsWhoseSumIsLessThanTarget;
import twopointers.issubsequence.IsSubsequence;
import twopointers.numberofarithmetictriples.NumberOfArithmeticTriples;
import twopointers.palindromicstring.FindFirstPalindromicString;
import twopointers.validpalindrome.ValidPalindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static math.convertthetemperature.ConvertTheTemperature.convertTemperature;
import static math.convertthetemperature.ConvertTheTemperature.convertTemperature2;

public class Main {

    public static void main(String[] args) {

        //Array -> MergeSortedArray
        System.out.println("MergeSortedArray");
        int m = 3;
        int n = 2;
        int s = m + n;
        int[] nums1 = {1, 5, 8, 0, 0};
        int[] nums2 = {3, 6};
        MergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println();

        //Array -> RemoveElement
        System.out.println("RemoveElement");
        int val = 3;
        int[] nums = {3,2,2,3};
        RemoveElement.removeElement1(nums, val);
        System.out.println();
        RemoveElement.removeElement2(nums, val);
        System.out.println();

        //Array -> RemoveDuplicates
        System.out.println("RemoveDuplicates");
        int[] nums3 = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicates.removeDuplicates1(nums3);
        System.out.println();

        //Array -> MajorityElement
        System.out.println("MajorityElement");
        int[] nums4 = {0,0,1,1,1,2,2,3,3,4};
        MajorityElement.majorityElement1(nums4);
        MajorityElement.majorityElement2(nums4);

        //String -> FindIndexOfFirstString (Find the Index of the First Occurrence in a String)
        System.out.println("FindIndexOfFirstString");
        String haystack = "jaolajestemolamam";
        String needle = "mam";
        System.out.println(FindIndexOfFirstString.strStr(haystack, needle));

        //String -> LengthLastWord (Length of Last Word)
        System.out.println("LengthLastWord");
        String word = "Hello World";
        System.out.println(LengthLastWord.lengthOfLastWord1(word));
        System.out.println(LengthLastWord.lengthOfLastWord2(word));

        //Two Pointers -> ValidPalindrome
        System.out.println("ValidPalindrome");
        String string = "A man, a plan, a -canal: Panama";
        System.out.println(ValidPalindrome.isPalindrome1(string));
        System.out.println(ValidPalindrome.isPalindrome2(string));

        //Two Pointers -> IsSubsequence
        System.out.println("IsSubsequence");
//        String a = "abc";
        String a = "aa";
        String b = "acfb";
        System.out.println(IsSubsequence.isSubsequence1(a, b));
        System.out.println(IsSubsequence.isSubsequence2(a, b));

        //Bit Manipulation -> SingleNumber
        System.out.println("SingleNumber");
//        int[] ints = {4,1,2,1,2};
        int[] ints = {2,2,1};
        System.out.println(SingleNumber.singleNumber1(ints));
        System.out.println(SingleNumber.singleNumber2(ints));

        //Math -> PalndromeNumber
        System.out.println("PalindromeNumber");
        int x = 10;
        System.out.println(PalindromeNumber.isPalindrome(x));

        //Math -> PlusOne
        System.out.println("PlusOne");
        int[] digits = {1,2,9};
//        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(PlusOne.plusOne1(digits)));
        System.out.println(Arrays.toString(PlusOne.plusOne2(digits)));

        //String -> FindTheDifference
        System.out.println("FindTheDifference");
        String a1 = "";
        String a2 = "a";
        System.out.println(FindTheDifference.findTheDifference(a1, a2));

        //String -> MergeStringsAlternately
        System.out.println("MergeStringsAlternately");
        String word1 = "abcd";
        String word2 = "pqklyre";
        System.out.println(MergeStringsAlternately.mergeAlternately1(word1, word2));
        System.out.println(MergeStringsAlternately.mergeAlternately2(word1, word2));

        //String -> ValidAnagram
        System.out.println("ValidAnagram");
        String w1 = "rat";
        String w2 = "car";
        System.out.println(ValidAnagram.isAnagram(w1, w2));

        //Array -> MoveZeroes
        System.out.println("MoveZeroes");
        int[] intsTab = {0, 1, 0, 3, 12};
//        int[] intsTab = {0};
        MoveZeroes.moveZeroes1(intsTab);
        int[] intsTab2 = {0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes2(intsTab2);

        //Array ->SignProductArray
        System.out.println("SignProductArray");
        int[] nums5 = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(SignProductArray.arraySign(nums5));

        //String -> ToLowerCase
        System.out.println("ToLowerCase");
        String q = "LOVELY";
        System.out.println(ToLowerCase.toLowerCase(q));

        //Array -> ArithmeticPrgression
        System.out.println("ArithmeticProgression");
        int[] intsTab3 = {3, 5, 1};
        System.out.println(ArithmeticProgression.canMakeArithmeticProgression1(intsTab3));
        System.out.println(ArithmeticProgression.canMakeArithmeticProgression2(intsTab3));

        //Matrix -> RichestCustomerWealth
        System.out.println("RichestCustomerWealth");
        int[][] accounts = {{1,2,3},{3,2,2}};
        System.out.println(RichestCustomerWealth.maximumWealth(accounts));

        //Array -> GetMaximumInGeneratedArray
        System.out.println("GetMaximumInGeneratedArray");
        int w = 7;
        System.out.println(GetMaximumInGeneratedArray.getMaximumGenerated1(w));
        System.out.println(GetMaximumInGeneratedArray.getMaximumGenerated2(w));

        //Matrix -> MatrixDagonalSum
        System.out.println("MatrixDiagonalSum");
//        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] mat = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        System.out.println(MatrixDiagonalSum.diagonalSum(mat));

        //Math -> CountOddNumber
        System.out.println("CountOddNumber");
        int low = 3;
        int high = 7;
        System.out.println(CountOddNumbers.countOdds(low, high));

        //String -> DefangingIPAddress
        System.out.println("DefangingIPAddress");
        String address = "1.1.1.1";
        System.out.println(DefangingIPAddress.defangIPaddr(address));

        //String -> JewelsAndStones
        System.out.println("JewelsAndStones");
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(JewelsAndStones.numJewelsInStones1(jewels, stones));
        System.out.println(JewelsAndStones.numJewelsInStones2(jewels, stones));

        //String -> FindWordsContainingCharacter
        System.out.println("FindWordsContainingCharacter");
        String[] words =  {"abc","bcd","aaaa","cbc"};
        char v = 'a';
        System.out.println(FindWordsContainingCharacter.findWordsContaining1(words, v));
        System.out.println(FindWordsContainingCharacter.findWordsContaining2(words, v));

        //String -> FizzBuzz
        System.out.println("FizzBuzz");
        int fb = 15;
        System.out.println(FizzBuzz.fizzBuzz1(fb));
        System.out.println(FizzBuzz.fizzBuzz2(fb));
        System.out.println(FizzBuzz.fizzBuzz3(fb));

        //String -> SortThePeople
        System.out.println("SortThePeople");
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        System.out.println(Arrays.toString(SortThePeople.sortPeople1(names, heights)));

        //String -> MaximumNumberOfWords
        System.out.println("MaximumNumberOfWords");
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(MaximumNumberOfWords.mostWordsFound(sentences));

        //String -> NumberOfGoodPairs
        System.out.println("NumberOfGoodPairs");
        int[] numsArray = {1,1,1,1};
        System.out.println(NumberOfGoodPairs.numIdenticalPairs(numsArray));

        //String -> CheckIfTwoStringArraysAreEquivalent
        System.out.println("CheckIfTwoStringArraysAreEquivalent");
        String[] word11 = {"a", "cb"};
        String[] word22 = {"ab", "c"};
        System.out.println(CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual1(word11, word22));
        System.out.println(CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual2(word11, word22));

        //String -> CheckIfSentenceIsPangram
        System.out.println("CheckIfSentenceIsPangram");
        String sentence = "thtequickbrownfoxjumpsoverthelazydog";
        System.out.println(CheckIfSentenceIsPangram.checkIfPangram(sentence));

        //Array -> HowManyNumbersAreSmaller
        System.out.println("HowManyNumbersAreSmaller");
        int[] numbers = {7,7,7,7};
        System.out.println(Arrays.toString(HowManyNumbersAreSmaller.smallerNumbersThanCurrent(numbers)));

        //Two Pointers -> CountPairsWhoseSumIsLessThanTarget
        System.out.println("CountPairsWhoseSumIsLessThanTarget");
        List<Integer> list = new ArrayList<>();
        list.add(-6);
        list.add(2);
        list.add(5);
        list.add(-2);
        list.add(-7);
        list.add(-1);
        list.add(3);
        int target = -2;
        System.out.println(CountPairsWhoseSumIsLessThanTarget.countPairs(list, target));

        //Two Pointers -> CountNumberOfFairPairs
        System.out.println("CountNumberOfFairPairs");
        int[] numsTP = {0,1,7,4,4,5};
        int lower = 3;
        int upper = 6;
        System.out.println(CountNumberOfFairPairs.countFairPairs1(numsTP, lower, upper));
        System.out.println(CountNumberOfFairPairs.countFairPairs2(numsTP, lower, upper));

        //String -> ReverseWordsInString
        System.out.println("ReverseWordsInString");
        String sentence1 = "Let's take LeetCode contest";
        System.out.println(ReverseWordsInString.reverseWords1(sentence1));

        //String -> FaultyKeyboard
        System.out.println("FaultyKeyboard");
        String s2 = "string";
        System.out.println(FaultyKeyboard.finalString(s2));

        //String -> MaxNumberOfStringPairs
        System.out.println("MaxNumberOfStringPairs");
        String[] words1 = {"cd","ac","dc","ca","zz"};
        System.out.println(MaxNumberOfStringPairs.maximumNumberOfStringPairs(words1));

        //TwoPointers -> NumberOfArithmeticTriples
        System.out.println("NumberOfArithmeticTriples");
        int[] nums6 = {4,5,6,7,8,9};
        int diff = 2;
        System.out.println(NumberOfArithmeticTriples.arithmeticTriplets(nums6, diff));

        //HashTable -> FindCommonElements
        System.out.println("FindCommonElements");
        int[] nums111 = {4,3,2,3,1};
        int[] nums222 = {2,2,5,2,3,6};
        System.out.println(Arrays.toString(FindCommonElements.findIntersectionValues(nums111, nums222)));

        //String -> TruncateSentence
        System.out.println("TruncateSentence");
        String s1 = "Hello how are you Contestant";
        int k = 4;
        System.out.println(TruncateSentence.truncateSentence1(s1, k));

        //String -> SortingTheSentence
        System.out.println("SortingTheSentence");
        String sentence11 = "is2 sentence4 This1 a3";
        System.out.println(SortingTheSentence.sortSentence(sentence11));

        //String -> CountinfWordsPrefix
        System.out.println("CountingWordsPrefix");
        String[] words2 = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(CountingWordsPrefix.prefixCount(words2, pref));

        //String -> CheckIfWordsOccurPrefix
        System.out.println("CheckIfWordsOccurPrefix");
        String sentence22 = "i love eating burger";
        String searchWord = "burg";
        System.out.println(CheckIfWordsOccurPrefix.isPrefixOfWord(sentence22, searchWord));

        //String -> ReverseString
        System.out.println("ReverseString");
        char[] chars = {'h','e','l','l','o'};
        ReverseString.reverseString(chars);
        System.out.println();

        //TwoPointers -> FindFirstPalindromicString
        System.out.println("FindFirstPalindromicString");
        String[] words11 = {"abc","car","ada","racecar","cool"};
        System.out.println(FindFirstPalindromicString.firstPalindrome(words11));

        //Array -> BestTimeStock
        System.out.println("BestTimeStock");
        int[] prices = {2,4,1};
        System.out.println(BestTimeStock.maxProfit(prices));

        //Array -> PascalsTriangleTwo
        System.out.println("PascalsTriangleTwo");
        int rowIndex = 2;
        System.out.println(PascalsTriangleTwo.getRow(rowIndex));

        //Array -> PascalsTriangle
        System.out.println("PascalsTriangle");
        int rowIdx = 5;
        System.out.println(PascalsTriangle.generate(rowIdx));

        //String -> MinNumberOfDeciBinary
        System.out.println("MinNumberOfDeciBinary");
        String num = "27346209830709182346";
        System.out.println(MinNumberOfDeciBinary.minPartitions1(num));
        System.out.println(MinNumberOfDeciBinary.minPartitions2(num));

        //String -> MinOperationMoveBalls
        System.out.println("MinOperationMoveBalls");
        String boxes = "001011";
        System.out.println(Arrays.toString(MinOperationMoveBalls.minOperations(boxes)));

        //Array -> NumberOfLaserBeams
        System.out.println("NumberOfLaserBeams");
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(NumberOfLaserBeams.numberOfBeams(bank));

        //String -> MinStepsToMakeAnagram
        System.out.println("MinStepsToMakeAnagram");
        String s11 = "xleetcode";
        String t11 = "epractice";
        System.out.println(MinStepsToMakeAnagram.minSteps(s11, t11));
        System.out.println(MinStepsToMakeAnagram.minSteps2(s11, t11));

        //Array -> MinNumberGame
        System.out.println("MinNumberGame");
        int[] nums12 = {5,4,2,3};
        System.out.println(Arrays.toString(MinNumberGame.numberGame(nums12)));
        System.out.println(Arrays.toString(MinNumberGame.numberGame2(nums12)));

        //Array -> SortStudents
        System.out.println("SortStudents");
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k1 = 2;
        System.out.println(Arrays.deepToString(SortStudents.sortTheStudents(score, k1)));

        //String -> StringScore
        System.out.println("StringScore");
        String str = "hello";
        System.out.println(StringScore.scoreOfString(str));
        System.out.println(StringScore.scoreOfString2(str));

        //Array -> ArrayConcatenation
        System.out.println("ArrayConcatenation");
        int[] nux = {1,2,1};
        System.out.println(Arrays.toString(ArrayConcatenation.getConcatenation(nux)));

        //Array -> ArrayFromPermutation
        System.out.println("ArrayFromPermutation");
        int[] nuxx = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(ArrayFromPermutation.buildArray(nuxx)));

        //Array -> FinalValue
        System.out.println("FinalValue");
        String[] operations = {"--X","X++","X++"};
        System.out.println(FinalValue.finalValueAfterOperations(operations));

        //Array -> ShuffleArray
        System.out.println("ShuffleArray");
        int[] numsTable = {2,5,1,3,4,7};
        int abc = 3;
        System.out.println(Arrays.toString(ShuffleArray.shuffle(numsTable, abc)));
        System.out.println(Arrays.toString(ShuffleArray.shuffle2(numsTable, abc)));

        //Array -> EmployeesTarget
        System.out.println("EmployeesTarget");
        int[] hours = {5,1,4,2,2};
        int targetEmp = 6;
        System.out.println(EmployeesTarget.numberOfEmployeesWhoMetTarget(hours, targetEmp));

        //Array -> RunningSum
        System.out.println("RunningSum");
        int[] numsRunningSum = {1,2,3,4};
        System.out.println(Arrays.toString(RunningSum.runningSum(numsRunningSum)));
        System.out.println(Arrays.toString(RunningSum.runningSum2(numsRunningSum)));

        //Array -> Candies
        System.out.println("Candies");
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Candies.kidsWithCandies(candies, extraCandies));
        System.out.println(Candies.kidsWithCandies2(candies, extraCandies));
        System.out.println(Candies.kidsWithCandies3(candies, extraCandies));

        //Array -> ArrayConditions
        System.out.println("ArrayConditions");
        int[] numsss = {1,3,4,1,2,3,1};
        System.out.println(ArrayConditions.findMatrix(numsss));

        //Array -> SumAndDigitSum
        System.out.println("SumAndDigitSum");
        int[] numTable = {1,15,6,3};
        System.out.println(SumAndDigitSum.differenceOfSum(numTable));

        //Array -> SumDifferences
        System.out.println("SumDifferences");
        int[] tabSum = {10,4,8,3};
        System.out.println(Arrays.toString(SumDifferences.leftRightDifference(tabSum)));

        //Array -> MiddleIndex
        System.out.println("MiddleIndex");
        int[] tabMiddleIndx = {2,3,-1,8,4};
        System.out.println(MiddleIndex.findMiddleIndex(tabMiddleIndx));
        System.out.println(MiddleIndex.findMiddleIndex2(tabMiddleIndx));

        //Array -> PivotIndex
        System.out.println("PivotIndex");
        int[] tabPivotIdx = {1,7,3,6,5,6};
        System.out.println(PivotIndex.pivotIndex(tabPivotIdx));

        //Array -> SplitArray
        System.out.println("SplitArray");
        int[] tabSplitArray = {10,4,-8,7};
        System.out.println(SplitArray.waysToSplitArray(tabSplitArray));

        //Array -> PermutationDifference
        System.out.println("PermutationDifference");
        String s0 = "abcde";
        String t0 = "edbac";
        System.out.println(PermutationDifference.findPermutationDifference(s0, t0));
        System.out.println(PermutationDifference.findPermutationDifference2(s0, t0));
        System.out.println(PermutationDifference.findPermutationDifference3(s0, t0));

        //String -> ReversePrefixWord
        System.out.println("ReversePrefixWord");
        String reverseRord = "abcdefd";
        char ch = 'd';
        System.out.println(ReversePrefixWord.reversePrefix(reverseRord, ch));
        System.out.println(ReversePrefixWord.reversePrefix2(reverseRord, ch));

        //HashTable -> GroupPeople
        System.out.println("GroupPeople");
        int[] groupSizes = {3,3,3,3,3,1,3};
        System.out.println(GroupPeople.groupThePeople(groupSizes));

        //HashTable -> DecodeTheMessage
        System.out.println("DecodeTheMessage");
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(DecodeTheMessage.decodeMessage(key, message));

        //String -> TimeToCollectGarbage
        System.out.println("TimeToCollectGarbage");
        String[] garbage = {"G","P","GP", "GG"};
        int[] travel = {2,4,3};
        System.out.println(TimeToCollectGarbage.garbageCollection(garbage, travel));

        //String -> GoalParserInterpretation
        System.out.println("GoalParserInterpretation");
        String command = "G()()()()(al)";
        System.out.println(GoalParserInterpretation.interpret(command));

        //Array - > DivisibleByThree
        System.out.println("DivisibleByThree");
        int[] three = {1,2,3,4};
        System.out.println(DivisibleByThree.minimumOperations(three));
        System.out.println(DivisibleByThree.minimumOperations2(three));

        //String -> BalancedString
        System.out.println("BalancedString");
        String balance = "RLRRRLLRLL";
        System.out.println(BalancedString.balancedStringSplit(balance));

        //String - > ConsistentString
        System.out.println("ConsistentString");
        String allowed = "cad";
        String[] wordsCS = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(ConsistentString.countConsistentStrings(allowed, wordsCS));

        //String ->AcronymOfWords
        System.out.println("AcronymOfWords");
        List<String> strings = List.of("afqcpzsx","icenu");
        String acronym = "yi";
        System.out.println(AcronymOfWords.isAcronym(strings, acronym));
        System.out.println(AcronymOfWords.isAcronym2(strings, acronym));

        //String -> DestinationCity
        System.out.println("DestinationCity");
        List<List<String>> paths = List.of(List.of("B","C"), List.of("D","B"), List.of("C","A"));
        System.out.println(DestinationCity.destCity(paths));
        System.out.println(DestinationCity.destCity2(paths));

        //Array -> CanPlaceFlowers
        System.out.println("CanPlaceFlowers");
        int[] flowerbed = {1,0,1,0,1,0,1};
        int numFlowers = 0;
        System.out.println(CanPlaceFlowers.canPlaceFlowers(flowerbed, numFlowers));

        //Math -> ConvertTheTemperature
        System.out.println("ConvertTheTemperature");
        double temperature = 36.50;
        System.out.println(Arrays.toString(convertTemperature(temperature)));
        System.out.println(Arrays.toString(convertTemperature2(temperature)));

        //Math -> DivisibleNonDivisibleSum
        System.out.println("DivisibleNonDivisibleSum");
        int nn = 5;
        int mm = 6;
        System.out.println(DivisibleNonDivisibleSum.differenceOfSums(nn, mm));

        //Math -> SmallestEvenMultiple
        System.out.println("SmallestEvenMultiple");
        int sem = 5;
        System.out.println(SmallestEvenMultiple.smallestEvenMultiple(sem));

        //Math -> ProductAndSum
        System.out.println("ProductAndSum");
        int pad = 234;
        System.out.println(ProductAndSum.subtractProductAndSum(pad));

        //Math -> MinSum
        System.out.println("MinSum");
        int ms = 2932;
        System.out.println(MinSum.minimumSum(ms));

        //Math -> SumMultiples
        System.out.println("SumMultiples");
        int sm = 7;
        System.out.println(SumMultiples.sumOfMultiples(sm));

        //Math -> NumberOfMatches
        System.out.println("NumberOfMatches");
        int nom = 14;
        System.out.println(NumberOfMatches.numberOfMatches(nom));

        //Math -> ReduceNumberToZero
        System.out.println("ReduceNumberToZero");
        int rntz = 14;
        System.out.println(ReduceNumberToZero.numberOfSteps(rntz));

        //Math -> HarshadNumber
        System.out.println("HarshadNumber");
        int hn = 18;
        System.out.println(HarshadNumber.sumOfTheDigitsOfHarshadNumber(hn));

        //Math -> MakeArrayEqual
        System.out.println("MakeArrayEqual");
        int mae = 5;
        System.out.println(MakeArrayEqual.minOperations(mae));

        //Math -> NumberOfCoins
        System.out.println("NumberOfCoins");
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(NumberOfCoins.maxCoins(piles));

        //Math -> WinnerCircularGame
        System.out.println("WinnerCircularGame");
        int wcg1 = 5;
        int wcg2 = 2;
        System.out.println(WinnerCircularGame.findTheWinner(wcg1, wcg2));

        //Math -> PivotInteger
        System.out.println("PivotInteger");
        int pi = 4;
        System.out.println(PivotInteger.pivotInteger(pi));

        //Math -> DistinctIntegers
        System.out.println("DistinctIntegers");
        int[] di = {1,13,10,12,31};
        System.out.println(DistinctIntegers.countDistinctIntegers(di));
        System.out.println(DistinctIntegers.countDistinctIntegers2(di));
        System.out.println(DistinctIntegers.countDistinctIntegers3(di));

        //Math -> MaxNumber
        System.out.println("MaxNumber");
        int mn = 9669;
        System.out.println(MaxNumber.maximum69Number(mn));
        System.out.println(MaxNumber.maximum69Number2(mn));
        System.out.println(MaxNumber.maximum69Number3(mn));

        //Math -> CountNumbers
        System.out.println("CountNumbers");
        int cn = 7;
        System.out.println(CountNumbers.countDigits(cn));

        //String -> WordPattern
        System.out.println("WordPattern");
        String pattern = "abba";
        String wp = "dog cat cat fish";
        System.out.println(WordPattern.wordPattern(pattern, wp));














































    }
}
