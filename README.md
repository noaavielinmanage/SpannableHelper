# SpannableHelper
[![](https://jitpack.io/v/noaavielinmanage/SpannableHelper.svg)](https://jitpack.io/#noaavielinmanage/SpannableHelper)

![image](https://github.com/noaavielinmanage/SpannableHelper/assets/119415508/2a2bba94-e492-4295-978d-113e608899c1)

The showTextPartlyBold function takes in three parameters: text (the input text), patternText (the pattern to be made bold), and color (the color to be applied to the bold part). It returns a SpannableString object that represents the input text with the specified pattern made bold and colored.

Here's a step-by-step explanation of the function:

1. Create a new SpannableString object spannableString with the text parameter as its content.

2. Use the getPatternIndices function to find the indices of the patternText within the text. This function returns a Pair object containing the start and end indices of the pattern in the text, or null if the pattern is not found.

3. Apply the specified color to the same range within spannableString to make the bold part visually stand out.

4. Finally, return the modified spannableString with the bold and colored text.

By using the returned SpannableString, you can display the input text with the specified pattern made bold and colored in a TextView or any other component that supports styled text.
