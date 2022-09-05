package medianOfTwoSortedArrays;
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;
        double[] res = new double[c];
        int aa = 0;
        int bb = 0;
        if (a==0){

            if (b % 2 == 0) {
                b--;
                double end=nums2[b / 2] + nums2[(b / 2) + 1] ;
                return end/2;
            } else {
                b--;
                return nums2[b / 2];
            }
        } else if (b == 0) {

            if (a % 2 == 0) {
                a--;
                double end=nums1[a / 2] + nums1[(a / 2) + 1] ;
                return end/2;
            } else {
                a--;
                return nums1[a / 2];
            }
        }else {
            for (int i = 0; i < c; i++) {
                int num1 = nums1[aa];
                int num2 = nums2[bb];
                if (num1 > num2 && bb != b - 1) {
                    res[i] = num2;

                    bb++;

                } else if (num1 <= num2 && aa != a - 1) {
                    res[i] = num1;
                    aa++;

                } else if (aa == a - 1) {
                    if (num1 <= num2) {
                        res[i] = num1;
                        i++;
                        while (bb < b) {
                            num2 = nums2[bb];

                            res[i] = num2;
                            i++;
                            bb++;
                        }
                    } else if (num2 < num1) {

                        res[i] = num2;
                        if (bb != b - 1) {
                            bb++;
                        }

                    }

                } else if (bb == b - 1) {
                    if (num2 <= num1) {
                        res[i] = num2;
                        i++;
                        while (aa < a) {
                            num1 = nums1[aa];

                            res[i] = num1;
                            i++;
                            aa++;

                        }
                    } else if (num1 < num2) {

                        res[i] = num1;
                        if (aa != a - 1) {
                            aa++;
                        }
                    }
                }

            }
        }
        if (c % 2 == 0) {


            c--;
            double end=res[c / 2] + res[(c / 2) + 1] ;
            return end/2;
        } else {
            c--;
            return res[c / 2];
        }
    }
    }