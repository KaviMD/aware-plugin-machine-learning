package com.aware.plugin.template;
import android.util.Log;
public class RandomForestClassifier {
    public static int predict_0(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 656.0) {
            if (features[10] <= 3.46663856506) {
                classes[0] = 584; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 12; 
            }
        } else {
            if (features[0] <= -0.030750144273) {
                if (features[13] <= 5.97839260101) {
                    if (features[29] <= 0.772117495537) {
                        if (features[11] <= 3412.0) {
                            classes[0] = 2; 
                            classes[1] = 22; 
                            classes[2] = 243; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 13; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 164; 
                }
            } else {
                if (features[0] <= 0.0712912157178) {
                    if (features[10] <= 1.17722272873) {
                        if (features[11] <= 2761.0) {
                            classes[0] = 15; 
                            classes[1] = 347; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -9.70258331299) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 76; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 4; 
                            classes[2] = 71; 
                            classes[3] = 44; 
                        }
                    }
                } else {
                    if (features[0] <= 0.369003802538) {
                        if (features[1] <= 1.71839749813) {
                            classes[0] = 0; 
                            classes[1] = 19; 
                            classes[2] = 106; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 102; 
                        }
                    } else {
                        if (features[5] <= 5076.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 62; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_1(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.357669353485) {
            if (features[15] <= -2.45390939713) {
                if (features[12] <= -6.81520414352) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                } else {
                    classes[0] = 295; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[12] <= 7.15354681015) {
                    if (features[16] <= 0.0617686137557) {
                        if (features[30] <= 0.845319628716) {
                            classes[0] = 176; 
                            classes[1] = 1; 
                            classes[2] = 24; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 1086.5) {
                            classes[0] = 29; 
                            classes[1] = 198; 
                            classes[2] = 27; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 87; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= -6.0) {
                        if (features[19] <= 0.560913562775) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 203; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[8] <= -8.5) {
                if (features[8] <= -38.0) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 74; 
                } else {
                    if (features[1] <= 1.41541731358) {
                        if (features[7] <= 1.2123657465) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 60; 
                    }
                }
            } else {
                if (features[4] <= 1.83324885368) {
                    if (features[6] <= -2.02686691284) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 13; 
                    } else {
                        if (features[16] <= 4.47952651978) {
                            classes[0] = 16; 
                            classes[1] = 6; 
                            classes[2] = 410; 
                            classes[3] = 15; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 13; 
                        }
                    }
                } else {
                    if (features[25] <= 0.622493445873) {
                        if (features[10] <= 3.41406440735) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 237; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_2(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.36450317502) {
            if (features[12] <= 8.26194858551) {
                if (features[17] <= 256.0) {
                    if (features[6] <= 0.00420070067048) {
                        if (features[7] <= 0.00614557787776) {
                            classes[0] = 21; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 181; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -10.0918884277) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 3785.0) {
                        classes[0] = 526; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[23] <= 0.403090119362) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        }
                    }
                }
            } else {
                if (features[1] <= 0.562005579472) {
                    classes[0] = 0; 
                    classes[1] = 216; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[13] <= 6.29766273499) {
                if (features[14] <= 2108.5) {
                    classes[0] = 16; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[26] <= 0.191284686327) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[32] <= 0.734100818634) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 475; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 384; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_3(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.351465284824) {
            if (features[11] <= 1024.0) {
                if (features[14] <= 2158.5) {
                    classes[0] = 153; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[9] <= 1.38365387917) {
                        if (features[2] <= 136.5) {
                            classes[0] = 10; 
                            classes[1] = 286; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        }
                    } else {
                        if (features[20] <= 0.650940775871) {
                            classes[0] = 0; 
                            classes[1] = 143; 
                            classes[2] = 33; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 26; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[22] <= 0.148587465286) {
                    classes[0] = 0; 
                    classes[1] = 2; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[26] <= 0.285927951336) {
                        if (features[9] <= 5.34239006042) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 3559.5) {
                            classes[0] = 395; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[5] <= -42.0) {
                if (features[12] <= -10.1633815765) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 4; 
                    classes[3] = 0; 
                } else {
                    if (features[13] <= 5.22339820862) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 113; 
                    }
                }
            } else {
                if (features[8] <= -11.5) {
                    if (features[16] <= 2.73934268951) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    } else {
                        if (features[20] <= 0.436876177788) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 79; 
                        }
                    }
                } else {
                    if (features[12] <= -9.88174438477) {
                        if (features[7] <= 1.27586722374) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 237; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        }
                    } else {
                        if (features[16] <= 3.49408078194) {
                            classes[0] = 14; 
                            classes[1] = 5; 
                            classes[2] = 176; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 166; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_4(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[12] <= 5.82000494003) {
                if (features[13] <= 6.47437000275) {
                    classes[0] = 531; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 2; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 13; 
            }
        } else {
            if (features[13] <= 6.29766273499) {
                if (features[13] <= 1.30918955803) {
                    if (features[0] <= -0.0308883227408) {
                        if (features[10] <= 0.19497191906) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 26; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 3580.5) {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 420; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[30] <= 0.149056866765) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[17] <= 451.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 453; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 15; 
                            classes[3] = 2; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 380; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_5(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.0929248333) {
            if (features[9] <= 4.60654830933) {
                if (features[15] <= 3.71596741676) {
                    if (features[0] <= -0.0335669182241) {
                        if (features[0] <= -0.0504820682108) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 2; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -6.64168643951) {
                            classes[0] = 26; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 352; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 185; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[12] <= -5.98844909668) {
                    classes[0] = 0; 
                    classes[1] = 15; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 319; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[1] <= 1.82365584373) {
                if (features[13] <= 5.925157547) {
                    if (features[32] <= 0.681254029274) {
                        if (features[7] <= 0.350086152554) {
                            classes[0] = 6; 
                            classes[1] = 17; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 478; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 2684.5) {
                            classes[0] = 24; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 2; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 76; 
                }
            } else {
                if (features[13] <= 6.35976219177) {
                    if (features[7] <= 1.11949038506) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 322; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_6(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481458961964) {
            if (features[12] <= 8.15013790131) {
                if (features[6] <= -0.0289433766156) {
                    if (features[9] <= 6.17524957657) {
                        if (features[12] <= -5.71960544586) {
                            classes[0] = 10; 
                            classes[1] = 200; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 78; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 96; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 0.0364064313471) {
                        if (features[12] <= -6.2938337326) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 189; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 66.5) {
                            classes[0] = 10; 
                            classes[1] = 15; 
                            classes[2] = 52; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 171; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 1.35070669651) {
                    classes[0] = 0; 
                    classes[1] = 223; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[1] <= 1.62466812134) {
                if (features[4] <= 2.07767677307) {
                    if (features[0] <= 0.461993485689) {
                        if (features[14] <= 3043.0) {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 414; 
                            classes[3] = 6; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 17; 
                    }
                } else {
                    if (features[16] <= 4.03507709503) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 9; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 23; 
                    }
                }
            } else {
                if (features[12] <= -9.87000656128) {
                    if (features[0] <= 0.0411574095488) {
                        if (features[26] <= 0.531902372837) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 12; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[28] <= 0.436414062977) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= 0.332368254662) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 345; 
                    } else {
                        if (features[13] <= 6.43285799026) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_7(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.332156002522) {
            if (features[15] <= -2.40316104889) {
                if (features[31] <= 0.745766878128) {
                    classes[0] = 298; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[15] <= -4.25814008713) {
                        classes[0] = 11; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[9] <= -2.92747688293) {
                    classes[0] = 85; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[11] <= 1500.5) {
                        if (features[16] <= 0.0381564572453) {
                            classes[0] = 52; 
                            classes[1] = 14; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 64; 
                            classes[1] = 389; 
                            classes[2] = 56; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[30] <= 0.777881622314) {
                            classes[0] = 82; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[8] <= 14.5) {
                if (features[7] <= 0.97380143404) {
                    if (features[13] <= 5.54205369949) {
                        if (features[9] <= 7.45096492767) {
                            classes[0] = 3; 
                            classes[1] = 7; 
                            classes[2] = 352; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 29; 
                    }
                } else {
                    if (features[5] <= 31.0) {
                        if (features[16] <= 3.33129692078) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 36; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 80; 
                        }
                    } else {
                        if (features[20] <= 0.672354638577) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 111; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.42488384247) {
                    if (features[0] <= 0.022144433111) {
                        if (features[29] <= 0.668024420738) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 30; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[22] <= 0.415474176407) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 1; 
                            classes[3] = 19; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 157; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_8(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 996.0) {
            if (features[4] <= 1.82942080498) {
                if (features[6] <= 0.00332918716595) {
                    if (features[16] <= 1.19100356102) {
                        if (features[17] <= 262.0) {
                            classes[0] = 46; 
                            classes[1] = 324; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 28; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 1.45930790901) {
                            classes[0] = 4; 
                            classes[1] = 12; 
                            classes[2] = 245; 
                            classes[3] = 16; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 27; 
                        }
                    }
                } else {
                    if (features[11] <= 2464.5) {
                        if (features[11] <= 212.5) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 203; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 26; 
                            classes[2] = 29; 
                            classes[3] = 6; 
                        }
                    } else {
                        classes[0] = 21; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[4] <= 2.01767373085) {
                    if (features[29] <= 0.541232645512) {
                        if (features[10] <= 3.27668142319) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 42; 
                        }
                    } else {
                        if (features[20] <= 0.389175534248) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= 3.0882267952) {
                        if (features[13] <= 5.26161384583) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 300; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[2] <= -7.0) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 9; 
            } else {
                if (features[1] <= 1.17413687706) {
                    classes[0] = 534; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 5; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_9(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.657070994377) {
            if (features[10] <= 0.0386035516858) {
                if (features[3] <= 0.00731277931482) {
                    if (features[30] <= 0.518626511097) {
                        if (features[17] <= 31.5) {
                            classes[0] = 2; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 178; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[27] <= 0.37529450655) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 46; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 2583.0) {
                        classes[0] = 6; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 10; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[14] <= 3295.0) {
                    classes[0] = 341; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[12] <= -9.03091430664) {
                        if (features[10] <= 0.114652991295) {
                            classes[0] = 1; 
                            classes[1] = 12; 
                            classes[2] = 44; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 121; 
                            classes[2] = 29; 
                            classes[3] = 15; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 240; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[1] <= 1.82365584373) {
                if (features[14] <= 3483.0) {
                    if (features[10] <= 3.28671979904) {
                        if (features[8] <= -5.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 1693.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 22; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 4.30751514435) {
                        if (features[13] <= 1.2685277462) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 464; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[20] <= 0.633584320545) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 30; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.50438213348) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 8; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 314; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_10(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.80431747437) {
            if (features[7] <= 0.36450317502) {
                if (features[31] <= 0.758458018303) {
                    if (features[16] <= 0.131449952722) {
                        if (features[14] <= 2668.5) {
                            classes[0] = 145; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 115; 
                            classes[2] = 55; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.132559150457) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 34; 
                            classes[1] = 194; 
                            classes[2] = 19; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[15] <= 4.16796779633) {
                        if (features[14] <= 2032.5) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 130; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 7; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[16] <= 4.02224302292) {
                    if (features[6] <= -0.297894746065) {
                        if (features[11] <= -19.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 14; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[13] <= 6.08357906342) {
                            classes[0] = 1; 
                            classes[1] = 4; 
                            classes[2] = 420; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 30; 
                        }
                    }
                } else {
                    if (features[13] <= 5.54205369949) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 16; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 344; 
                    }
                }
            }
        } else {
            if (features[1] <= 0.857939243317) {
                if (features[24] <= 0.272520422935) {
                    if (features[32] <= 0.231277167797) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[22] <= 0.148587465286) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[20] <= 0.267417520285) {
                            classes[0] = 4; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 326; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 29; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_11(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.38004362583) {
            if (features[4] <= 0.0114421127364) {
                if (features[30] <= 0.612592637539) {
                    if (features[12] <= 7.23378562927) {
                        if (features[12] <= -6.28871297836) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 258; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 18; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[19] <= 0.701085925102) {
                        if (features[6] <= -0.389266848564) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 29; 
                            classes[1] = 1; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 0.0267228409648) {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[15] <= -2.47887277603) {
                    classes[0] = 129; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[30] <= 0.511675834656) {
                        if (features[11] <= 570.5) {
                            classes[0] = 29; 
                            classes[1] = 107; 
                            classes[2] = 17; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 62; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 2250.5) {
                            classes[0] = 50; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 259; 
                            classes[2] = 40; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[19] <= 0.123452275991) {
                if (features[13] <= 5.2898812294) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 6; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 119; 
                }
            } else {
                if (features[13] <= 6.2551202774) {
                    if (features[9] <= 7.32313156128) {
                        if (features[17] <= 1833.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 499; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 14; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 252; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_12(double[] features) {
        int[] classes = new int[4];
        
        if (features[5] <= 0.5) {
            if (features[17] <= 915.5) {
                if (features[4] <= 0.75488370657) {
                    if (features[11] <= 2761.0) {
                        if (features[18] <= 0.545173764229) {
                            classes[0] = 10; 
                            classes[1] = 275; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 131; 
                            classes[2] = 44; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 67; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 3.83721613884) {
                        if (features[1] <= 1.84180045128) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 156; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 15; 
                        }
                    } else {
                        if (features[10] <= 3.45883083344) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 115; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.31758451462) {
                    classes[0] = 483; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 4; 
                }
            }
        } else {
            if (features[16] <= 4.47952651978) {
                if (features[29] <= 0.725249290466) {
                    if (features[7] <= 0.332156002522) {
                        if (features[25] <= 0.595688700676) {
                            classes[0] = 1; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[22] <= 0.51383125782) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 276; 
                            classes[3] = 14; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 38; 
                            classes[3] = 34; 
                        }
                    }
                } else {
                    if (features[15] <= -2.02291989326) {
                        classes[0] = 10; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 17; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[32] <= 0.625205039978) {
                    if (features[13] <= 5.86056995392) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 166; 
                    }
                } else {
                    if (features[10] <= 4.41741466522) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 11; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_13(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.31764578819) {
            if (features[9] <= 4.63160705566) {
                if (features[9] <= -2.93697285652) {
                    classes[0] = 103; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[10] <= 0.0877348557115) {
                        if (features[11] <= 181.5) {
                            classes[0] = 64; 
                            classes[1] = 65; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 49; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= 5.04438781738) {
                            classes[0] = 31; 
                            classes[1] = 307; 
                            classes[2] = 22; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 31; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 3580.5) {
                    classes[0] = 320; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 17; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[19] <= 0.0921832174063) {
                if (features[13] <= 5.46713113785) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 4; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 107; 
                }
            } else {
                if (features[16] <= 4.36821937561) {
                    if (features[9] <= 6.61438560486) {
                        if (features[13] <= 5.40875339508) {
                            classes[0] = 10; 
                            classes[1] = 16; 
                            classes[2] = 429; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 39; 
                        }
                    } else {
                        if (features[4] <= 1.14455592632) {
                            classes[0] = 24; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[19] <= 0.873092353344) {
                        if (features[32] <= 0.698862671852) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 220; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 3.50457048416) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 12; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_14(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.375710725784) {
            if (features[12] <= 8.31382274628) {
                if (features[14] <= 3580.5) {
                    classes[0] = 549; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[14] <= 6230.0) {
                        if (features[13] <= 1.07408320904) {
                            classes[0] = 0; 
                            classes[1] = 136; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 6; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[7] <= 0.0137964282185) {
                            classes[0] = 4; 
                            classes[1] = 8; 
                            classes[2] = 51; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 32; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[16] <= 1.66157388687) {
                    classes[0] = 0; 
                    classes[1] = 225; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[30] <= 0.499895572662) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[13] <= 5.925157547) {
                if (features[16] <= 0.940964758396) {
                    if (features[10] <= 0.998717665672) {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 5; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[25] <= 0.313845515251) {
                        classes[0] = 6; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 1.0862801075) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 457; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.90983021259) {
                    if (features[7] <= 0.761372983456) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 84; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 327; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_15(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1615.5) {
            if (features[0] <= -0.0871868878603) {
                if (features[22] <= 0.670422434807) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 11; 
                } else {
                    classes[0] = 2; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[4] <= 1.50526452065) {
                    classes[0] = 574; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 18; 
                }
            }
        } else {
            if (features[1] <= 0.502808868885) {
                if (features[14] <= 6250.0) {
                    if (features[9] <= 4.80483055115) {
                        if (features[1] <= 0.402859121561) {
                            classes[0] = 0; 
                            classes[1] = 365; 
                            classes[2] = 5; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 783.0) {
                            classes[0] = 0; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 48.0) {
                        if (features[22] <= 0.442902326584) {
                            classes[0] = 2; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[13] <= 4.8778090477) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 60; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.2551202774) {
                    if (features[22] <= 0.646266102791) {
                        if (features[7] <= 1.28310477734) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 412; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 40; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 361; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_16(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.53779947758) {
            if (features[17] <= 333.0) {
                if (features[13] <= 0.953722119331) {
                    if (features[14] <= 2803.5) {
                        classes[0] = 40; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[6] <= 0.00765752606094) {
                            classes[0] = 7; 
                            classes[1] = 346; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 39; 
                            classes[2] = 65; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 0.99936401844) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[15] <= -0.93211877346) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 24; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[22] <= 0.634594321251) {
                    classes[0] = 469; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[23] <= 0.304055452347) {
                        if (features[26] <= 0.452596157789) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 37; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[1] <= 1.81824147701) {
                if (features[13] <= 5.925157547) {
                    if (features[7] <= 0.358377933502) {
                        if (features[11] <= 737.0) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 3130.0) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 431; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 68; 
                }
            } else {
                if (features[10] <= 3.15533185005) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 6; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 351; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_17(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.63160705566) {
            if (features[13] <= 5.925157547) {
                if (features[13] <= 1.2685277462) {
                    if (features[14] <= 2152.0) {
                        classes[0] = 236; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[0] <= -0.027433399111) {
                            classes[0] = 1; 
                            classes[1] = 38; 
                            classes[2] = 69; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 398; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[15] <= 2.58493971825) {
                        if (features[30] <= 0.159520685673) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 412; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 377; 
            }
        } else {
            if (features[1] <= 0.904214024544) {
                if (features[19] <= 0.835964441299) {
                    if (features[6] <= -0.159171998501) {
                        if (features[9] <= 6.30123949051) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[26] <= 0.750770688057) {
                            classes[0] = 320; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[31] <= 0.841058075428) {
                        if (features[31] <= 0.73242110014) {
                            classes[0] = 24; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 22; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_18(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.925157547) {
            if (features[17] <= 550.0) {
                if (features[13] <= 1.25968658924) {
                    if (features[6] <= 0.00570857524872) {
                        if (features[4] <= 0.00592383556068) {
                            classes[0] = 23; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 35; 
                            classes[1] = 354; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6120.0) {
                            classes[0] = 20; 
                            classes[1] = 33; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 68; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[9] <= 7.88988304138) {
                        if (features[31] <= 0.860797822475) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 449; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[1] <= 0.970523536205) {
                    classes[0] = 506; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 4; 
                    classes[3] = 0; 
                }
            }
        } else {
            classes[0] = 0; 
            classes[1] = 0; 
            classes[2] = 0; 
            classes[3] = 426; 
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_19(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.42212295532) {
            if (features[1] <= 0.498605489731) {
                if (features[11] <= 1020.0) {
                    if (features[15] <= 4.67158174515) {
                        if (features[12] <= 5.43133211136) {
                            classes[0] = 44; 
                            classes[1] = 174; 
                            classes[2] = 51; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 232; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 114; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[12] <= -6.16733026505) {
                        classes[0] = 0; 
                        classes[1] = 15; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 416; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[9] <= 7.73684406281) {
                    if (features[28] <= 0.728648841381) {
                        if (features[32] <= 0.770434260368) {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 454; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.557136535645) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 4; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[13] <= 6.2551202774) {
                if (features[7] <= 0.954966425896) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 8; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 403; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_20(double[] features) {
        int[] classes = new int[4];
        
        if (features[12] <= -9.70010757446) {
            if (features[3] <= -0.00731384474784) {
                if (features[13] <= 1.52622580528) {
                    if (features[3] <= -0.0303933992982) {
                        classes[0] = 0; 
                        classes[1] = 90; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= -10.1509780884) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 4.84532117844) {
                        if (features[0] <= 0.701570272446) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 102; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 4; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                }
            } else {
                if (features[8] <= -10.0) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 6; 
                } else {
                    if (features[1] <= 2.2630572319) {
                        if (features[9] <= -0.490402817726) {
                            classes[0] = 5; 
                            classes[1] = 16; 
                            classes[2] = 56; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 145; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    }
                }
            }
        } else {
            if (features[10] <= 3.49267625809) {
                if (features[14] <= 3322.0) {
                    classes[0] = 569; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[13] <= 1.26554107666) {
                        if (features[10] <= 1.73409867287) {
                            classes[0] = 0; 
                            classes[1] = 311; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 2.02870774269) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 161; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    }
                }
            } else {
                if (features[12] <= 9.4009513855) {
                    if (features[13] <= 5.17508459091) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 26; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 340; 
                    }
                } else {
                    if (features[28] <= 0.527616500854) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 16; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 24; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_21(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.350119680166) {
            if (features[16] <= 0.0395857617259) {
                if (features[14] <= 4095.0) {
                    classes[0] = 269; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[0] <= -0.0260219536722) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 24; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[12] <= 8.26194858551) {
                    if (features[11] <= 1426.5) {
                        if (features[30] <= 0.585779666901) {
                            classes[0] = 85; 
                            classes[1] = 63; 
                            classes[2] = 19; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 30; 
                            classes[1] = 125; 
                            classes[2] = 21; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 177; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[0] <= 0.043685823679) {
                        classes[0] = 0; 
                        classes[1] = 187; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[23] <= 0.461284041405) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[12] <= -9.85270023346) {
                if (features[4] <= 2.27249670029) {
                    if (features[16] <= 1.38406062126) {
                        classes[0] = 0; 
                        classes[1] = 8; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 1.209379673) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 262; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[10] <= 3.76950716972) {
                        if (features[16] <= 1.1603679657) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 11; 
                    }
                }
            } else {
                if (features[4] <= 1.7515771389) {
                    if (features[12] <= 9.04581260681) {
                        if (features[17] <= 501.0) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 38; 
                            classes[3] = 37; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[13] <= 0.873539686203) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 175; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 3.4566078186) {
                        if (features[1] <= 1.63259935379) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 324; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_22(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1041.5) {
            if (features[7] <= 0.871084094048) {
                classes[0] = 569; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 31; 
            }
        } else {
            if (features[1] <= 0.565174996853) {
                if (features[11] <= 2756.0) {
                    if (features[14] <= 6201.0) {
                        if (features[17] <= 557.0) {
                            classes[0] = 0; 
                            classes[1] = 349; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[0] <= -0.0193958152086) {
                            classes[0] = 2; 
                            classes[1] = 9; 
                            classes[2] = 48; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 16; 
                            classes[1] = 50; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 12; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[17] <= -122.5) {
                    if (features[25] <= 0.621584057808) {
                        if (features[1] <= 1.3966755867) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 111; 
                        }
                    } else {
                        if (features[1] <= 1.72517609596) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[4] <= 1.91612744331) {
                        if (features[13] <= 5.925157547) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 429; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 50; 
                        }
                    } else {
                        if (features[17] <= 19.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 29; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 185; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_23(double[] features) {
        int[] classes = new int[4];
        
        if (features[5] <= 0.5) {
            if (features[7] <= 0.385427981615) {
                if (features[4] <= 0.0112042371184) {
                    if (features[29] <= 0.312915891409) {
                        if (features[10] <= 0.0518637821078) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[22] <= 0.284039199352) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 292; 
                            classes[1] = 19; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[0] <= -0.0308883227408) {
                        if (features[7] <= 0.0125015154481) {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 40; 
                            classes[1] = 18; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 4.80431747437) {
                            classes[0] = 103; 
                            classes[1] = 365; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 102; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[2] <= 56.5) {
                    if (features[16] <= 4.02333068848) {
                        if (features[15] <= -3.65998363495) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 155; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[4] <= 1.63409030437) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 64; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 58; 
                }
            }
        } else {
            if (features[2] <= -52.0) {
                if (features[25] <= 0.563223361969) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 96; 
                } else {
                    if (features[25] <= 0.577673017979) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    }
                }
            } else {
                if (features[10] <= 3.96052360535) {
                    if (features[13] <= 1.38631367683) {
                        if (features[14] <= 2835.0) {
                            classes[0] = 28; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 24; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.734100818634) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 283; 
                            classes[3] = 9; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    if (features[16] <= 3.24620079994) {
                        if (features[4] <= 0.999642193317) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[21] <= 0.657939374447) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 137; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_24(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.668085992336) {
            if (features[17] <= 256.5) {
                if (features[8] <= 65.0) {
                    if (features[16] <= 0.0319859534502) {
                        if (features[9] <= 5.80288028717) {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 26; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 56.5) {
                            classes[0] = 9; 
                            classes[1] = 260; 
                            classes[2] = 5; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 21; 
                            classes[1] = 108; 
                            classes[2] = 45; 
                            classes[3] = 3; 
                        }
                    }
                } else {
                    if (features[4] <= 0.298665076494) {
                        if (features[23] <= 0.0455354824662) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 4.23994874954) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    }
                }
            } else {
                if (features[14] <= 3785.0) {
                    if (features[17] <= 350.0) {
                        if (features[20] <= 0.459110438824) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 516; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[30] <= 0.634744524956) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 5; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[14] <= 4711.0) {
                if (features[11] <= 1363.0) {
                    if (features[26] <= 0.254116356373) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[22] <= 0.349308788776) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 195; 
                        }
                    }
                } else {
                    if (features[18] <= 0.693410515785) {
                        if (features[10] <= 1.88184666634) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 29; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 12; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[22] <= 0.451179862022) {
                    if (features[10] <= 3.86949682236) {
                        if (features[5] <= 88.0) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 313; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[27] <= 0.571752667427) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 34; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[5] <= -21.5) {
                        if (features[27] <= 0.558396697044) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 49; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[13] <= 6.10107707977) {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 144; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 75; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_25(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.70870304108) {
            if (features[3] <= 0.110365413129) {
                if (features[7] <= 0.357850253582) {
                    if (features[14] <= 3580.5) {
                        classes[0] = 580; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[14] <= 6250.0) {
                            classes[0] = 1; 
                            classes[1] = 366; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 42; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 0.940964758396) {
                        if (features[11] <= 1691.5) {
                            classes[0] = 1; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[32] <= 0.696839690208) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 263; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 0.648094773293) {
                    if (features[27] <= 0.491183370352) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 8; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[24] <= 0.69947373867) {
                        if (features[30] <= 0.900454461575) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 151; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 1.12763881683) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 1.17156338692) {
                if (features[1] <= 1.62296950817) {
                    if (features[7] <= 1.16387629509) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 14; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 64; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 335; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_26(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 3.49267625809) {
            if (features[7] <= 0.379305243492) {
                if (features[12] <= 8.26194858551) {
                    if (features[30] <= 0.57400983572) {
                        if (features[12] <= -6.50144958496) {
                            classes[0] = 5; 
                            classes[1] = 51; 
                            classes[2] = 37; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 464; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= -0.021499697119) {
                            classes[0] = 49; 
                            classes[1] = 131; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 58; 
                            classes[1] = 8; 
                            classes[2] = 41; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[28] <= 0.645166158676) {
                        if (features[4] <= 0.719618558884) {
                            classes[0] = 0; 
                            classes[1] = 201; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= -0.0164424553514) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 0.634163379669) {
                    if (features[19] <= 0.333426713943) {
                        if (features[3] <= -9.64302444458) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 15; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[23] <= 0.185269400477) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 1.93811953068) {
                        if (features[15] <= 3.77413606644) {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 378; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 6.43285799026) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 1.35127913952) {
                if (features[8] <= 32.0) {
                    if (features[13] <= 6.00454902649) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 41; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 15; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 21; 
                }
            } else {
                if (features[28] <= 0.670411229134) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 356; 
                } else {
                    if (features[12] <= -0.682727575302) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_27(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 977.0) {
            if (features[16] <= 1.1197810173) {
                if (features[10] <= 0.0328487381339) {
                    if (features[6] <= -0.0809526070952) {
                        classes[0] = 34; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[9] <= 6.11907577515) {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 6250.0) {
                        if (features[11] <= 2803.5) {
                            classes[0] = 2; 
                            classes[1] = 374; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 22; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 48.0) {
                            classes[0] = 11; 
                            classes[1] = 36; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 62; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.925157547) {
                    if (features[14] <= 2050.0) {
                        classes[0] = 4; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 1.24531698227) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 447; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[22] <= 0.340462982655) {
                        if (features[25] <= 0.419778764248) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 362; 
                    }
                }
            }
        } else {
            classes[0] = 509; 
            classes[1] = 0; 
            classes[2] = 0; 
            classes[3] = 15; 
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_28(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.539332926273) {
            if (features[11] <= 1020.0) {
                if (features[17] <= 2100.0) {
                    if (features[4] <= 0.00224103056826) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    } else {
                        if (features[0] <= -0.030451990664) {
                            classes[0] = 2; 
                            classes[1] = 28; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 401; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 168; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[28] <= 0.772044241428) {
                    if (features[17] <= 1.0) {
                        if (features[9] <= 7.17245817184) {
                            classes[0] = 0; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 418; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[31] <= 0.698238611221) {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[16] <= 3.96333241463) {
                if (features[4] <= 1.95703399181) {
                    if (features[4] <= 0.673185646534) {
                        if (features[23] <= 0.298191964626) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 16; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 5; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 1.87602901459) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 388; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 13; 
                        }
                    }
                } else {
                    if (features[25] <= 0.456785470247) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 21; 
                    } else {
                        if (features[18] <= 0.664610207081) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                }
            } else {
                if (features[12] <= -10.0966186523) {
                    if (features[11] <= -89.5) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 5; 
                    } else {
                        if (features[23] <= 0.348392188549) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 15; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 1.52858185768) {
                        if (features[13] <= 5.30441999435) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 313; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_29(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481204628944) {
            if (features[32] <= 0.483000516891) {
                if (features[14] <= 2568.0) {
                    classes[0] = 223; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[3] <= -0.00988471880555) {
                        if (features[19] <= 0.815036594868) {
                            classes[0] = 0; 
                            classes[1] = 89; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 0.0286250282079) {
                            classes[0] = 0; 
                            classes[1] = 51; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 62; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 0.0429383665323) {
                    if (features[32] <= 0.771009802818) {
                        if (features[16] <= 0.0119171403348) {
                            classes[0] = 8; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 155; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[23] <= 0.406154960394) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[23] <= 0.622324168682) {
                        if (features[30] <= 0.768770813942) {
                            classes[0] = 146; 
                            classes[1] = 93; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 86; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -5.59558677673) {
                            classes[0] = 2; 
                            classes[1] = 13; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 55; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[17] <= -114.5) {
                if (features[4] <= 1.39017868042) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 6; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 112; 
                }
            } else {
                if (features[7] <= 0.985537290573) {
                    if (features[18] <= 0.623591840267) {
                        if (features[17] <= 523.0) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 319; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[13] <= 5.87401294708) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 19; 
                        }
                    }
                } else {
                    if (features[13] <= 5.94364929199) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 78; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 270; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_30(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.530741810799) {
            if (features[14] <= 3580.5) {
                classes[0] = 584; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[0] <= -0.0274843033403) {
                    if (features[16] <= 0.212413787842) {
                        if (features[12] <= -10.1556663513) {
                            classes[0] = 1; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 60; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.0508625879884) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 28; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 1.01908063889) {
                        if (features[15] <= -1.01813900471) {
                            classes[0] = 7; 
                            classes[1] = 124; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 263; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[1] <= 1.70754265785) {
                if (features[3] <= -0.999923348427) {
                    if (features[7] <= 1.29559588432) {
                        if (features[14] <= 5259.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 28; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 23; 
                    }
                } else {
                    if (features[32] <= 0.740310549736) {
                        if (features[8] <= 50.0) {
                            classes[0] = 4; 
                            classes[1] = 1; 
                            classes[2] = 418; 
                            classes[3] = 20; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 10; 
                        }
                    } else {
                        classes[0] = 5; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[13] <= 6.43285799026) {
                    if (features[30] <= 0.559304237366) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 12; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 319; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_31(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -3.99106311798) {
            if (features[16] <= 5.03063631058) {
                classes[0] = 291; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 1; 
            }
        } else {
            if (features[14] <= 627.5) {
                if (features[13] <= 6.73659038544) {
                    classes[0] = 297; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 16; 
                }
            } else {
                if (features[16] <= 1.1197810173) {
                    if (features[14] <= 6250.0) {
                        if (features[7] <= 0.00240014120936) {
                            classes[0] = 9; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 366; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -10.1313591003) {
                            classes[0] = 8; 
                            classes[1] = 29; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 53; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 1.75435781479) {
                        if (features[13] <= 5.925157547) {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 409; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 66; 
                        }
                    } else {
                        if (features[9] <= 5.14301109314) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 20; 
                            classes[3] = 329; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_32(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 996.0) {
            if (features[5] <= 0.5) {
                if (features[13] <= 1.3939344883) {
                    if (features[9] <= 6.87282180786) {
                        if (features[13] <= 0.0747122764587) {
                            classes[0] = 7; 
                            classes[1] = 190; 
                            classes[2] = 47; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 193; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 65; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[1] <= 1.80842661858) {
                        if (features[7] <= 1.9759042263) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 147; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        }
                    } else {
                        if (features[22] <= 0.393094182014) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 129; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.968615651131) {
                    if (features[1] <= 0.514525175095) {
                        if (features[13] <= 1.36305308342) {
                            classes[0] = 0; 
                            classes[1] = 24; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[14] <= 7333.5) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 238; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    }
                } else {
                    if (features[13] <= 5.40313529968) {
                        if (features[7] <= 2.54375267029) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 75; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 210; 
                    }
                }
            }
        } else {
            if (features[12] <= -5.62000370026) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 21; 
            } else {
                if (features[11] <= -169.5) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 5; 
                } else {
                    if (features[13] <= 5.79117155075) {
                        classes[0] = 532; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_33(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 973.0) {
            if (features[12] <= -9.87000656128) {
                if (features[6] <= -0.0239449478686) {
                    if (features[15] <= -1.53047442436) {
                        if (features[16] <= 1.55546379089) {
                            classes[0] = 0; 
                            classes[1] = 19; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 118; 
                            classes[3] = 16; 
                        }
                    } else {
                        if (features[15] <= -0.390772670507) {
                            classes[0] = 19; 
                            classes[1] = 86; 
                            classes[2] = 13; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 16; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 4.57100391388) {
                        if (features[21] <= 0.365988761187) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 161; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                }
            } else {
                if (features[5] <= 0.5) {
                    if (features[13] <= 1.18328928947) {
                        if (features[1] <= 0.00310359383002) {
                            classes[0] = 30; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 23; 
                            classes[1] = 284; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 5.77391433716) {
                            classes[0] = 5; 
                            classes[1] = 1; 
                            classes[2] = 81; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 124; 
                        }
                    }
                } else {
                    if (features[10] <= 3.41546702385) {
                        if (features[7] <= 0.355523109436) {
                            classes[0] = 1; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 111; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[31] <= 0.738617062569) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 25; 
                            classes[3] = 222; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 4; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 1.26728057861) {
                classes[0] = 516; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 15; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_34(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[10] <= 3.37657761574) {
                classes[0] = 563; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 14; 
            }
        } else {
            if (features[4] <= 0.70883834362) {
                if (features[0] <= -0.0308883227408) {
                    if (features[6] <= 0.0215692557395) {
                        if (features[14] <= 5380.0) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 74; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 10; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[6] <= -1.33963894844) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 12; 
                    } else {
                        if (features[14] <= 3559.5) {
                            classes[0] = 14; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 415; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.86056184769) {
                    if (features[25] <= 0.342591077089) {
                        if (features[22] <= 0.407355010509) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    } else {
                        if (features[15] <= 0.591315567493) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 416; 
                            classes[3] = 13; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        }
                    }
                } else {
                    if (features[22] <= 0.37554949522) {
                        if (features[16] <= 4.63656187057) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[9] <= 4.99204349518) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 324; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_35(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -3.99106311798) {
            if (features[14] <= 3384.5) {
                classes[0] = 288; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[2] <= 135.5) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 2; 
                }
            }
        } else {
            if (features[7] <= 0.379305243492) {
                if (features[9] <= 5.33409118652) {
                    if (features[17] <= 1094.0) {
                        if (features[7] <= 0.00987838860601) {
                            classes[0] = 3; 
                            classes[1] = 105; 
                            classes[2] = 47; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 292; 
                            classes[2] = 21; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 174; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 101; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[12] <= -9.86915111542) {
                    if (features[8] <= -10.0) {
                        if (features[16] <= 4.18272256851) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    } else {
                        if (features[7] <= 1.26061332226) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 222; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 17; 
                        }
                    }
                } else {
                    if (features[12] <= 9.44529151917) {
                        if (features[1] <= 1.42488384247) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 45; 
                            classes[3] = 37; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 353; 
                        }
                    } else {
                        if (features[16] <= 3.48666000366) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 161; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 17; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_36(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.657121419907) {
            if (features[1] <= 0.00643331743777) {
                if (features[3] <= -2.04861450195) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 5; 
                } else {
                    if (features[14] <= 4095.0) {
                        classes[0] = 276; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 0.00564490491524) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[17] <= 256.5) {
                    if (features[16] <= 1.66375875473) {
                        if (features[17] <= 54.5) {
                            classes[0] = 8; 
                            classes[1] = 257; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 127; 
                            classes[2] = 51; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= -0.352377593517) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 27; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        }
                    }
                } else {
                    if (features[3] <= -6.30112123489) {
                        if (features[14] <= 5360.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 810.5) {
                            classes[0] = 12; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 269; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[8] <= -8.5) {
                if (features[13] <= 5.79127216339) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 20; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 134; 
                }
            } else {
                if (features[16] <= 4.0231628418) {
                    if (features[10] <= 1.29073655605) {
                        if (features[11] <= 769.5) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 2.00744223595) {
                            classes[0] = 6; 
                            classes[1] = 2; 
                            classes[2] = 422; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 21; 
                        }
                    }
                } else {
                    if (features[12] <= -10.010892868) {
                        if (features[4] <= 2.31651258469) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 20; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[4] <= 1.43549346924) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 181; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_37(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1041.5) {
            classes[0] = 569; 
            classes[1] = 0; 
            classes[2] = 0; 
            classes[3] = 26; 
        } else {
            if (features[13] <= 5.42212295532) {
                if (features[7] <= 0.335940718651) {
                    if (features[6] <= 0.00644064508379) {
                        if (features[14] <= 3580.5) {
                            classes[0] = 13; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 352; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 1.95281815529) {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 69; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 25; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 0.911478698254) {
                        classes[0] = 0; 
                        classes[1] = 7; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[27] <= 0.783293187618) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 487; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.748800396919) {
                    if (features[13] <= 7.41708850861) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 357; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_38(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[8] <= 2.5) {
                if (features[16] <= 3.8426823616) {
                    classes[0] = 554; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 5; 
                }
            } else {
                if (features[2] <= 1194.5) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 25; 
                } else {
                    classes[0] = 13; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[7] <= 0.357669353485) {
                if (features[0] <= -0.0335669182241) {
                    if (features[19] <= 0.345368504524) {
                        if (features[1] <= 0.861280918121) {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 58.5) {
                            classes[0] = 3; 
                            classes[1] = 9; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 57; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[7] <= 0.00352855050005) {
                        if (features[3] <= -0.00620276574045) {
                            classes[0] = 20; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6231.0) {
                            classes[0] = 3; 
                            classes[1] = 347; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 20; 
                            classes[1] = 49; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.49267625809) {
                    if (features[17] <= -246.0) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    } else {
                        if (features[4] <= 0.0998323857784) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 388; 
                            classes[3] = 4; 
                        }
                    }
                } else {
                    if (features[27] <= 0.608151197433) {
                        if (features[13] <= 5.01453828812) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 28; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 341; 
                        }
                    } else {
                        if (features[5] <= 42.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_39(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.379305243492) {
            if (features[17] <= 314.0) {
                if (features[16] <= 0.0321746766567) {
                    if (features[14] <= 3339.0) {
                        classes[0] = 31; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[3] <= -0.00133197300602) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 0.006989993155) {
                        if (features[6] <= 0.00611824262887) {
                            classes[0] = 0; 
                            classes[1] = 30; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 27; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.706429839134) {
                            classes[0] = 21; 
                            classes[1] = 364; 
                            classes[2] = 34; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -6.72413873672) {
                    if (features[11] <= 24.5) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    } else {
                        if (features[21] <= 0.444846510887) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    classes[0] = 569; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[10] <= 3.49704360962) {
                if (features[11] <= 3036.0) {
                    if (features[16] <= 0.940964758396) {
                        if (features[6] <= -0.224640220404) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[24] <= 0.257640868425) {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 405; 
                            classes[3] = 5; 
                        }
                    }
                } else {
                    classes[0] = 8; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[16] <= 3.13622045517) {
                    if (features[5] <= 2331.5) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 28; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 7; 
                    }
                } else {
                    if (features[3] <= -0.428907394409) {
                        if (features[3] <= -0.434771418571) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 68; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 289; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_40(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.29073655605) {
            if (features[17] <= 302.5) {
                if (features[14] <= 2803.5) {
                    classes[0] = 40; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[0] <= -0.0330093801022) {
                        if (features[7] <= 0.0307905524969) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 45; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 20; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 1.47774076462) {
                            classes[0] = 11; 
                            classes[1] = 374; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 504; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            }
        } else {
            if (features[13] <= 5.70870304108) {
                if (features[17] <= 913.5) {
                    if (features[1] <= 0.457730740309) {
                        if (features[7] <= 0.469600081444) {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.149056866765) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 467; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 26; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[13] <= 6.2551202774) {
                    if (features[30] <= 0.559304237366) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 5; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 405; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_41(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[4] <= 1.38959538937) {
                classes[0] = 593; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 24; 
            }
        } else {
            if (features[13] <= 5.70870304108) {
                if (features[16] <= 1.1197810173) {
                    if (features[14] <= 6250.0) {
                        if (features[17] <= 1045.5) {
                            classes[0] = 12; 
                            classes[1] = 360; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 56.0) {
                            classes[0] = 8; 
                            classes[1] = 26; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 12; 
                            classes[2] = 45; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[30] <= 0.134309202433) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 1.02945697308) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 441; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.35976219177) {
                    if (features[3] <= 0.571773529053) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 374; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_42(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.925157547) {
            if (features[12] <= -5.67023944855) {
                if (features[16] <= 1.6260355711) {
                    if (features[16] <= 0.0647647231817) {
                        if (features[31] <= 0.807056844234) {
                            classes[0] = 3; 
                            classes[1] = 4; 
                            classes[2] = 35; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6190.0) {
                            classes[0] = 0; 
                            classes[1] = 133; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 54; 
                            classes[2] = 32; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[8] <= 15.5) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 234; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 4.75674057007) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 32; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[14] <= 3896.0) {
                    classes[0] = 567; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[1] <= 0.427807360888) {
                        classes[0] = 0; 
                        classes[1] = 216; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[21] <= 0.219246953726) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 195; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[3] <= 0.75612026453) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 354; 
            } else {
                if (features[13] <= 6.91810083389) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 44; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_43(double[] features) {
        int[] classes = new int[4];
        
        if (features[3] <= 0.110365413129) {
            if (features[17] <= 965.0) {
                if (features[4] <= 0.728925466537) {
                    if (features[6] <= 0.00644064508379) {
                        if (features[9] <= 6.89168119431) {
                            classes[0] = 7; 
                            classes[1] = 390; 
                            classes[2] = 15; 
                            classes[3] = 27; 
                        } else {
                            classes[0] = 41; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= 0.0215692557395) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 19; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 3.97982263565) {
                        if (features[1] <= 1.89271318913) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 256; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 22; 
                        }
                    } else {
                        if (features[9] <= 5.01845598221) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 206; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.69804811478) {
                    classes[0] = 500; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 9; 
                }
            }
        } else {
            if (features[16] <= 4.0109500885) {
                if (features[14] <= 1067.5) {
                    classes[0] = 10; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[11] <= -36.5) {
                        if (features[30] <= 0.541709303856) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[2] <= -73.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 172; 
                            classes[3] = 6; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.63409030437) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 10; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 122; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_44(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -3.98888254166) {
            classes[0] = 281; 
            classes[1] = 0; 
            classes[2] = 0; 
            classes[3] = 0; 
        } else {
            if (features[13] <= 5.925157547) {
                if (features[15] <= 3.83518338203) {
                    if (features[1] <= 0.517316699028) {
                        if (features[11] <= 2808.5) {
                            classes[0] = 11; 
                            classes[1] = 418; 
                            classes[2] = 55; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 58; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[27] <= 0.790120303631) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 466; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 236; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 402; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_45(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.329145312309) {
            if (features[9] <= 4.60654830933) {
                if (features[21] <= 0.562631249428) {
                    if (features[12] <= 5.26673078537) {
                        if (features[14] <= 2200.0) {
                            classes[0] = 145; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 166; 
                            classes[2] = 40; 
                            classes[3] = 3; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 171; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[0] <= -0.0271019283682) {
                        if (features[28] <= 0.456065118313) {
                            classes[0] = 16; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 3; 
                            classes[2] = 23; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= -2.79676008224) {
                            classes[0] = 37; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 54; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -6.16733026505) {
                    classes[0] = 0; 
                    classes[1] = 12; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 343; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[16] <= 3.82354450226) {
                if (features[14] <= 1457.5) {
                    classes[0] = 14; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[0] <= 0.503029942513) {
                        if (features[1] <= 1.81675457954) {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 435; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 21; 
                        }
                    } else {
                        if (features[22] <= 0.394928842783) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.35976219177) {
                    if (features[15] <= 2.15210700035) {
                        if (features[14] <= 6455.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 29; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 343; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_46(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481204628944) {
            if (features[15] <= -2.47887277603) {
                if (features[19] <= 0.996541082859) {
                    if (features[32] <= 0.18938472867) {
                        if (features[30] <= 0.551840305328) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 321; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                }
            } else {
                if (features[11] <= 1511.5) {
                    if (features[4] <= 0.00946520268917) {
                        if (features[15] <= 3.37096953392) {
                            classes[0] = 0; 
                            classes[1] = 28; 
                            classes[2] = 6; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 42; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= 0.00838959589601) {
                            classes[0] = 62; 
                            classes[1] = 363; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 45; 
                            classes[1] = 31; 
                            classes[2] = 58; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= -0.165329143405) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 134; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[1] <= 1.70337915421) {
                if (features[7] <= 1.84788870811) {
                    if (features[16] <= 4.64049196243) {
                        if (features[8] <= 74.5) {
                            classes[0] = 6; 
                            classes[1] = 5; 
                            classes[2] = 421; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 9; 
                            classes[3] = 20; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 24; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 19; 
                }
            } else {
                if (features[13] <= 6.08321666718) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 15; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 307; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_47(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.379305243492) {
            if (features[17] <= 256.0) {
                if (features[11] <= 2756.0) {
                    if (features[12] <= -10.0918884277) {
                        if (features[3] <= -0.0294087976217) {
                            classes[0] = 2; 
                            classes[1] = 70; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 20; 
                            classes[2] = 70; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 1.24531698227) {
                            classes[0] = 0; 
                            classes[1] = 331; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 8; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    classes[0] = 43; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[14] <= 4116.0) {
                    classes[0] = 486; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[30] <= 0.504825055599) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        if (features[19] <= 0.971428513527) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            }
        } else {
            if (features[7] <= 0.963515937328) {
                if (features[4] <= 2.29646873474) {
                    if (features[15] <= -3.65998363495) {
                        classes[0] = 6; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[16] <= 5.43424701691) {
                            classes[0] = 10; 
                            classes[1] = 2; 
                            classes[2] = 377; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        }
                    }
                } else {
                    if (features[19] <= 0.389049381018) {
                        if (features[32] <= 0.551435172558) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 21; 
                    }
                }
            } else {
                if (features[9] <= 2.02277755737) {
                    if (features[1] <= 1.65902662277) {
                        if (features[0] <= 0.272348940372) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 39; 
                            classes[3] = 14; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 26; 
                        }
                    } else {
                        if (features[0] <= 2.19049596786) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 275; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[28] <= 0.553506374359) {
                        if (features[1] <= 1.38583362103) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 29; 
                        }
                    } else {
                        if (features[24] <= 0.478905200958) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 53; 
                            classes[3] = 1; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_48(double[] features) {
        int[] classes = new int[4];
        
        if (features[4] <= 0.721818685532) {
            if (features[12] <= 8.15013790131) {
                if (features[12] <= -6.19554758072) {
                    if (features[10] <= 2.4014544487) {
                        if (features[0] <= -0.0342377573252) {
                            classes[0] = 2; 
                            classes[1] = 7; 
                            classes[2] = 83; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 182; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 23; 
                    }
                } else {
                    classes[0] = 582; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 206; 
                classes[2] = 0; 
                classes[3] = 0; 
            }
        } else {
            if (features[1] <= 1.81675982475) {
                if (features[22] <= 0.502157330513) {
                    if (features[16] <= 4.16532230377) {
                        if (features[18] <= 0.696742296219) {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 395; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 5.96698760986) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 21; 
                        }
                    }
                } else {
                    if (features[10] <= 4.0385684967) {
                        if (features[14] <= 3664.5) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 44; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 29; 
                    }
                }
            } else {
                if (features[12] <= -10.0322465897) {
                    if (features[29] <= 0.602955579758) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 6; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                } else {
                    if (features[10] <= 3.42453622818) {
                        if (features[3] <= -0.461663663387) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 301; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_49(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[16] <= 4.28914451599) {
                classes[0] = 568; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 13; 
            }
        } else {
            if (features[16] <= 1.1197810173) {
                if (features[7] <= 0.0157613381743) {
                    if (features[17] <= 4.5) {
                        if (features[14] <= 6290.0) {
                            classes[0] = 0; 
                            classes[1] = 115; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 2.43757772446) {
                            classes[0] = 8; 
                            classes[1] = 9; 
                            classes[2] = 56; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 32; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= 0.00499589927495) {
                        if (features[13] <= 0.0634874999523) {
                            classes[0] = 3; 
                            classes[1] = 26; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 200; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -10.0972890854) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 20; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.573990345) {
                    if (features[10] <= 0.932723522186) {
                        classes[0] = 0; 
                        classes[1] = 8; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[1] <= 0.423180669546) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 474; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 366; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_50(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= -3.95571541786) {
            if (features[10] <= 3.09932088852) {
                classes[0] = 296; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[27] <= 0.501207172871) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 2; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[12] <= -9.87000656128) {
                if (features[10] <= 1.22546482086) {
                    if (features[10] <= 0.100095115602) {
                        if (features[0] <= -0.0209229774773) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 14; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 62.0) {
                            classes[0] = 9; 
                            classes[1] = 104; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 19; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 1.10010194778) {
                        if (features[11] <= -159.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 207; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[4] <= 1.2594025135) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        }
                    }
                }
            } else {
                if (features[7] <= 0.353180646896) {
                    if (features[11] <= 1036.0) {
                        if (features[17] <= 1773.0) {
                            classes[0] = 0; 
                            classes[1] = 275; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 124; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= -0.156015872955) {
                            classes[0] = 2; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 148; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[13] <= 5.42313575745) {
                        if (features[1] <= 0.385055541992) {
                            classes[0] = 9; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 218; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 393; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_51(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.25400900841) {
            if (features[11] <= 1020.0) {
                if (features[14] <= 2200.0) {
                    classes[0] = 157; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[17] <= 56.5) {
                        if (features[22] <= 0.78768658638) {
                            classes[0] = 3; 
                            classes[1] = 282; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.0104462038726) {
                            classes[0] = 2; 
                            classes[1] = 24; 
                            classes[2] = 46; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 93; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[12] <= -6.11573600769) {
                    classes[0] = 0; 
                    classes[1] = 10; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 396; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[8] <= -9.5) {
                if (features[23] <= 0.337919533253) {
                    if (features[29] <= 0.477699160576) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 6; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 5; 
                    }
                } else {
                    if (features[22] <= 0.310181677341) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 4; 
                        classes[3] = 0; 
                    } else {
                        if (features[13] <= 5.87191295624) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 134; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.83634209633) {
                    if (features[10] <= 4.22418212891) {
                        if (features[17] <= 811.0) {
                            classes[0] = 4; 
                            classes[1] = 14; 
                            classes[2] = 419; 
                            classes[3] = 13; 
                        } else {
                            classes[0] = 30; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[25] <= 0.551287710667) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 32; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[25] <= 0.590085864067) {
                        if (features[10] <= 3.03342199326) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 205; 
                        }
                    } else {
                        if (features[13] <= 5.66528129578) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_52(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[4] <= 1.33634650707) {
                classes[0] = 571; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 24; 
            }
        } else {
            if (features[4] <= 1.75736641884) {
                if (features[7] <= 0.340309977531) {
                    if (features[14] <= 6250.0) {
                        if (features[16] <= 0.0294011160731) {
                            classes[0] = 11; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 341; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.0125353708863) {
                            classes[0] = 4; 
                            classes[1] = 10; 
                            classes[2] = 39; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 30; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 1.25146472454) {
                        if (features[13] <= 0.904796123505) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 397; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[1] <= 1.15436828136) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 36; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 34; 
                        }
                    }
                }
            } else {
                if (features[28] <= 0.588846921921) {
                    if (features[13] <= 6.43285799026) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 18; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 299; 
                    }
                } else {
                    if (features[20] <= 0.59706056118) {
                        if (features[4] <= 1.88121461868) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 37; 
                        }
                    } else {
                        if (features[22] <= 0.525259494781) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_53(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481204628944) {
            if (features[14] <= 3580.5) {
                classes[0] = 597; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[4] <= 0.0183128602803) {
                    if (features[13] <= 0.0344680249691) {
                        if (features[29] <= 0.338793575764) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 69; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= -0.00663498882204) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 33; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[0] <= -0.0342377573252) {
                        if (features[29] <= 0.511135458946) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 14; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 15; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[22] <= 0.810220837593) {
                            classes[0] = 7; 
                            classes[1] = 300; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[22] <= 0.459613859653) {
                if (features[11] <= 158.5) {
                    if (features[16] <= 4.38306808472) {
                        if (features[5] <= 104.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 277; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 5; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[6] <= 0.303694546223) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 40; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[24] <= 0.543858587742) {
                        if (features[11] <= 1604.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 47; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[2] <= 42.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 25; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.70052194595) {
                    if (features[8] <= 32.5) {
                        if (features[9] <= 7.62475824356) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 124; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 5372.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 16; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 9; 
                            classes[3] = 5; 
                        }
                    }
                } else {
                    if (features[10] <= 3.48545098305) {
                        if (features[13] <= 5.4129281044) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[13] <= 5.34879207611) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 253; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_54(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.89318132401) {
            if (features[10] <= 1.4130436182) {
                if (features[14] <= 3559.5) {
                    classes[0] = 542; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[0] <= -0.0320130884647) {
                        if (features[17] <= 59.0) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 52; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 1.47774076462) {
                            classes[0] = 13; 
                            classes[1] = 384; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[11] <= 2342.0) {
                    if (features[7] <= 0.325200140476) {
                        if (features[11] <= 98.0) {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.272962540388) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 443; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[4] <= 1.54578101635) {
                        classes[0] = 14; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 4; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[15] <= -4.37982177734) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 2; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 411; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_55(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.40020465851) {
            if (features[11] <= 1024.0) {
                if (features[6] <= 0.00178400869481) {
                    if (features[17] <= 1724.5) {
                        if (features[12] <= -10.1590061188) {
                            classes[0] = 12; 
                            classes[1] = 18; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 337; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 49; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[12] <= -10.0918884277) {
                        if (features[4] <= 0.375050574541) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 1979.5) {
                            classes[0] = 0; 
                            classes[1] = 37; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 107; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[26] <= 0.750770688057) {
                    if (features[16] <= 0.100837469101) {
                        classes[0] = 308; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[21] <= 0.56727129221) {
                            classes[0] = 56; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 33; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[26] <= 0.765284240246) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[19] <= 0.804527640343) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[10] <= 3.76185488701) {
                if (features[17] <= 843.5) {
                    if (features[10] <= 3.37820959091) {
                        if (features[23] <= 0.0713577345014) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 425; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[9] <= 1.95161175728) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 17; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 24; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[5] <= 84.5) {
                        classes[0] = 9; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                }
            } else {
                if (features[16] <= 3.29126739502) {
                    if (features[13] <= 5.02661180496) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 28; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 10; 
                    }
                } else {
                    if (features[4] <= 1.73450493813) {
                        if (features[4] <= 1.73261618614) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 30; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 1.70754265785) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 35; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 282; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_56(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.474714756012) {
            if (features[11] <= 1032.0) {
                if (features[21] <= 0.516498446465) {
                    if (features[1] <= 0.00356910424307) {
                        if (features[18] <= 0.878215432167) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[0] <= -0.0305198654532) {
                            classes[0] = 19; 
                            classes[1] = 6; 
                            classes[2] = 26; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 42; 
                            classes[1] = 245; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= 1592.5) {
                        if (features[12] <= -10.0907621384) {
                            classes[0] = 4; 
                            classes[1] = 45; 
                            classes[2] = 42; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 100; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 92; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[27] <= 0.352600485086) {
                    if (features[12] <= -6.09026002884) {
                        classes[0] = 0; 
                        classes[1] = 8; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 20; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[11] <= 1330.5) {
                        if (features[30] <= 0.667668581009) {
                            classes[0] = 17; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[30] <= 0.841058075428) {
                            classes[0] = 388; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[12] <= -9.86268997192) {
                if (features[8] <= -11.0) {
                    if (features[9] <= -0.528448760509) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[10] <= 4.40015792847) {
                        if (features[6] <= -2.10576581955) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 255; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 10; 
                    }
                }
            } else {
                if (features[1] <= 1.42488384247) {
                    if (features[14] <= 3337.5) {
                        if (features[8] <= 8.5) {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    } else {
                        if (features[12] <= -8.6623878479) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 7; 
                            classes[3] = 14; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 181; 
                            classes[3] = 6; 
                        }
                    }
                } else {
                    if (features[3] <= 0.746668815613) {
                        if (features[21] <= 0.26505112648) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 310; 
                        }
                    } else {
                        if (features[12] <= -8.00791549683) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 23; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 5; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_57(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.474714756012) {
            if (features[0] <= 0.0630342066288) {
                if (features[16] <= 0.0338747650385) {
                    if (features[17] <= 335.5) {
                        if (features[11] <= 2299.5) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 31; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 219; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[30] <= 0.327378928661) {
                        if (features[23] <= 0.561978936195) {
                            classes[0] = 39; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 256.0) {
                            classes[0] = 17; 
                            classes[1] = 329; 
                            classes[2] = 49; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 98; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[14] <= 2810.0) {
                    classes[0] = 212; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 51; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[4] <= 1.76116728783) {
                if (features[10] <= 4.31603860855) {
                    if (features[13] <= 5.70870304108) {
                        if (features[32] <= 0.69925904274) {
                            classes[0] = 1; 
                            classes[1] = 3; 
                            classes[2] = 426; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 17; 
                    }
                } else {
                    if (features[22] <= 0.372814446688) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 3; 
                        classes[3] = 0; 
                    } else {
                        if (features[26] <= 0.546986281872) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 22; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[16] <= 3.4619474411) {
                    if (features[30] <= 0.620776176453) {
                        if (features[17] <= -35.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 21; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[11] <= 1303.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 3.02066802979) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 7; 
                        classes[3] = 0; 
                    } else {
                        if (features[22] <= 0.340462982655) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 319; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_58(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 973.0) {
            if (features[5] <= 0.5) {
                if (features[1] <= 0.616513490677) {
                    if (features[9] <= 6.89168119431) {
                        if (features[10] <= 0.0876977145672) {
                            classes[0] = 1; 
                            classes[1] = 96; 
                            classes[2] = 64; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 300; 
                            classes[2] = 16; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 68; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 4919.0) {
                        if (features[1] <= 1.24524021149) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 77; 
                        }
                    } else {
                        if (features[13] <= 6.37960147858) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 136; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 46; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.76141548157) {
                    if (features[8] <= 110.5) {
                        if (features[4] <= 0.0844668596983) {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 9; 
                            classes[2] = 281; 
                            classes[3] = 18; 
                        }
                    } else {
                        if (features[16] <= 2.4884262085) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 19; 
                        }
                    }
                } else {
                    if (features[12] <= -10.2216873169) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 6; 
                        classes[3] = 0; 
                    } else {
                        if (features[22] <= 0.296912610531) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 212; 
                        }
                    }
                }
            }
        } else {
            if (features[14] <= 1036.5) {
                classes[0] = 494; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[16] <= 3.37407684326) {
                    classes[0] = 4; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 28; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_59(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 656.0) {
            if (features[16] <= 4.02624130249) {
                classes[0] = 543; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 21; 
            }
        } else {
            if (features[3] <= 0.0936466082931) {
                if (features[13] <= 5.70870304108) {
                    if (features[13] <= 0.98205780983) {
                        if (features[12] <= -10.0933513641) {
                            classes[0] = 13; 
                            classes[1] = 75; 
                            classes[2] = 53; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 25; 
                            classes[1] = 318; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 1.36454236507) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 285; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 239; 
                }
            } else {
                if (features[7] <= 0.906973481178) {
                    if (features[31] <= 0.229418128729) {
                        if (features[8] <= 2.0) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[4] <= 2.26510334015) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 144; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 8; 
                        }
                    }
                } else {
                    if (features[4] <= 1.88078641891) {
                        if (features[18] <= 0.451423764229) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 33; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 22.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 46; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 85; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_60(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.31512606144) {
            if (features[31] <= 0.58226454258) {
                if (features[12] <= 8.31382274628) {
                    if (features[3] <= -0.152123272419) {
                        if (features[6] <= -0.122913345695) {
                            classes[0] = 10; 
                            classes[1] = 27; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 0.107019864023) {
                            classes[0] = 355; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 85; 
                            classes[1] = 26; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 0.54083275795) {
                        classes[0] = 0; 
                        classes[1] = 103; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 8; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[11] <= 1525.5) {
                    if (features[11] <= 82.5) {
                        if (features[9] <= -0.521441936493) {
                            classes[0] = 44; 
                            classes[1] = 17; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 67; 
                            classes[2] = 31; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 0.0128054767847) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 140; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[30] <= 0.84833574295) {
                        classes[0] = 59; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[13] <= 5.925157547) {
                if (features[15] <= -4.24600744247) {
                    classes[0] = 15; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[15] <= 1.26308870316) {
                        if (features[30] <= 0.900454461575) {
                            classes[0] = 2; 
                            classes[1] = 5; 
                            classes[2] = 481; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[25] <= 0.579196572304) {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.35756492615) {
                    if (features[19] <= 0.381759345531) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 398; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_61(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.2474155426) {
            if (features[30] <= 0.512343764305) {
                if (features[17] <= 335.5) {
                    if (features[9] <= 5.78402042389) {
                        if (features[14] <= 6230.0) {
                            classes[0] = 0; 
                            classes[1] = 128; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 10; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 29; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 335; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[10] <= 0.0418677516282) {
                    if (features[12] <= 8.18846893311) {
                        if (features[22] <= 0.651046514511) {
                            classes[0] = 64; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 11; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 2295.5) {
                        classes[0] = 110; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 0.0164187289774) {
                            classes[0] = 4; 
                            classes[1] = 110; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 179; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 1.81824147701) {
                if (features[14] <= 3483.0) {
                    if (features[7] <= 0.871084094048) {
                        classes[0] = 39; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 26; 
                    }
                } else {
                    if (features[5] <= 75.5) {
                        if (features[1] <= 0.517316699028) {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 417; 
                            classes[3] = 11; 
                        }
                    } else {
                        if (features[5] <= 5058.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 12; 
                            classes[3] = 35; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.08321666718) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 9; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 303; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_62(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 996.0) {
            if (features[5] <= 0.5) {
                if (features[7] <= 0.379545837641) {
                    if (features[9] <= 6.87282180786) {
                        if (features[14] <= 6201.0) {
                            classes[0] = 0; 
                            classes[1] = 354; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 17; 
                            classes[1] = 34; 
                            classes[2] = 66; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 50; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[16] <= 3.47681665421) {
                        if (features[14] <= 3482.5) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 129; 
                            classes[3] = 6; 
                        }
                    } else {
                        if (features[22] <= 0.428049981594) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 14; 
                            classes[3] = 19; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 107; 
                        }
                    }
                }
            } else {
                if (features[16] <= 3.97538208961) {
                    if (features[5] <= 2446.0) {
                        if (features[24] <= 0.384410560131) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 3; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 261; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[13] <= 4.43194532394) {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 16; 
                        }
                    }
                } else {
                    if (features[12] <= -10.1386508942) {
                        if (features[4] <= 1.37858068943) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[22] <= 0.560946822166) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 196; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 30; 
                        }
                    }
                }
            }
        } else {
            if (features[4] <= 1.78532326221) {
                if (features[6] <= -0.286697208881) {
                    if (features[23] <= 0.956637382507) {
                        classes[0] = 22; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                } else {
                    classes[0] = 514; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 16; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_63(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1041.5) {
            if (features[7] <= 1.09064888954) {
                classes[0] = 595; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 23; 
            }
        } else {
            if (features[32] <= 0.695768237114) {
                if (features[11] <= -143.5) {
                    if (features[25] <= 0.628784060478) {
                        if (features[4] <= 1.17380928993) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 86; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[13] <= 5.90240097046) {
                        if (features[4] <= 0.671931862831) {
                            classes[0] = 25; 
                            classes[1] = 325; 
                            classes[2] = 68; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 401; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 295; 
                    }
                }
            } else {
                if (features[23] <= 0.687221884727) {
                    if (features[16] <= 2.09845113754) {
                        if (features[31] <= 0.725194096565) {
                            classes[0] = 6; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 62; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 5.39836883545) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    }
                } else {
                    if (features[20] <= 0.481172680855) {
                        classes[0] = 0; 
                        classes[1] = 1; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 7; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_64(double[] features) {
        int[] classes = new int[4];
        
        if (features[11] <= 1040.5) {
            if (features[4] <= 1.75442433357) {
                if (features[5] <= 0.5) {
                    if (features[17] <= 1773.0) {
                        if (features[16] <= 1.77446985245) {
                            classes[0] = 14; 
                            classes[1] = 393; 
                            classes[2] = 68; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 116; 
                            classes[3] = 9; 
                        }
                    } else {
                        classes[0] = 155; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[26] <= 0.214242905378) {
                        classes[0] = 0; 
                        classes[1] = 13; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[0] <= 0.503510475159) {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 257; 
                            classes[3] = 22; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 13; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.37089204788) {
                    if (features[28] <= 0.728357195854) {
                        if (features[8] <= -28.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 23; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[10] <= 3.89747214317) {
                        if (features[19] <= 0.544132947922) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 19; 
                        }
                    } else {
                        if (features[25] <= 0.69514131546) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 307; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[0] <= -0.0946305841208) {
                if (features[4] <= 2.0357632637) {
                    if (features[14] <= 1778.5) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 19; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 6; 
                }
            } else {
                if (features[24] <= 0.29915329814) {
                    if (features[12] <= -5.19964075089) {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= 5.39032173157) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[12] <= -5.85804128647) {
                        if (features[13] <= 1.16546916962) {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 4250.5) {
                            classes[0] = 421; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_65(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.464159607887) {
            if (features[15] <= -2.47887277603) {
                if (features[5] <= 552.0) {
                    if (features[30] <= 0.697865962982) {
                        classes[0] = 289; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[30] <= 0.733750581741) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 2; 
                }
            } else {
                if (features[30] <= 0.582590579987) {
                    if (features[14] <= 3008.0) {
                        classes[0] = 226; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[16] <= 4.42880725861) {
                            classes[0] = 11; 
                            classes[1] = 191; 
                            classes[2] = 23; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    }
                } else {
                    if (features[14] <= 2142.0) {
                        classes[0] = 52; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= -10.1023006439) {
                            classes[0] = 5; 
                            classes[1] = 53; 
                            classes[2] = 29; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 192; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[17] <= -165.5) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 96; 
            } else {
                if (features[15] <= 0.324385821819) {
                    if (features[19] <= 0.091399602592) {
                        if (features[7] <= 0.844023227692) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 52; 
                        }
                    } else {
                        if (features[1] <= 1.63165903091) {
                            classes[0] = 2; 
                            classes[1] = 4; 
                            classes[2] = 421; 
                            classes[3] = 43; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 22; 
                            classes[3] = 136; 
                        }
                    }
                } else {
                    if (features[13] <= 6.04551458359) {
                        if (features[18] <= 0.498023271561) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 47; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_66(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[13] <= 6.61872529984) {
                classes[0] = 582; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 22; 
            }
        } else {
            if (features[8] <= -8.5) {
                if (features[11] <= 1875.5) {
                    if (features[4] <= 1.43939840794) {
                        if (features[16] <= 3.02697324753) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[2] <= -0.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 117; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 36; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                }
            } else {
                if (features[1] <= 0.498605489731) {
                    if (features[6] <= 0.00644064508379) {
                        if (features[14] <= 3559.5) {
                            classes[0] = 10; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 361; 
                            classes[2] = 2; 
                            classes[3] = 4; 
                        }
                    } else {
                        if (features[11] <= 66.5) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 54; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 31; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= -137.5) {
                        if (features[22] <= 0.42212548852) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 54; 
                        }
                    } else {
                        if (features[13] <= 5.94364929199) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 461; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 152; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_67(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1069.0) {
            if (features[1] <= 1.17290282249) {
                classes[0] = 616; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 17; 
            }
        } else {
            if (features[3] <= 0.0732868611813) {
                if (features[1] <= 0.599732577801) {
                    if (features[12] <= -10.086145401) {
                        if (features[4] <= 0.0606717430055) {
                            classes[0] = 1; 
                            classes[1] = 20; 
                            classes[2] = 52; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 63; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 2761.0) {
                            classes[0] = 5; 
                            classes[1] = 305; 
                            classes[2] = 4; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 1.69547438622) {
                        if (features[0] <= 0.461993485689) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 251; 
                            classes[3] = 24; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    } else {
                        if (features[12] <= -10.1386508942) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 189; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.78313112259) {
                    if (features[4] <= 0.72943007946) {
                        if (features[23] <= 0.542941272259) {
                            classes[0] = 0; 
                            classes[1] = 10; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 6.92004108429) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 183; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[9] <= 4.87553501129) {
                        if (features[27] <= 0.492293179035) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 79; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 45; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 4; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_68(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.63160705566) {
            if (features[1] <= 0.515214979649) {
                if (features[16] <= 0.03687351197) {
                    if (features[17] <= 913.5) {
                        if (features[0] <= -0.0267419032753) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 70; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 2200.0) {
                        classes[0] = 149; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[0] <= -0.0330093801022) {
                            classes[0] = 1; 
                            classes[1] = 33; 
                            classes[2] = 57; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 367; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.94364929199) {
                    if (features[31] <= 0.159520685673) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[22] <= 0.646266102791) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 418; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[22] <= 0.340462982655) {
                        if (features[15] <= -2.63092851639) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 392; 
                    }
                }
            }
        } else {
            if (features[10] <= 2.68257665634) {
                if (features[31] <= 0.717192173004) {
                    classes[0] = 350; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                } else {
                    if (features[15] <= -2.57650303841) {
                        classes[0] = 8; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[7] <= 0.0172925200313) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 23; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_69(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            classes[0] = 591; 
            classes[1] = 0; 
            classes[2] = 0; 
            classes[3] = 26; 
        } else {
            if (features[13] <= 5.94364929199) {
                if (features[16] <= 1.11256480217) {
                    if (features[13] <= 0.0829512476921) {
                        if (features[12] <= -10.0836410522) {
                            classes[0] = 16; 
                            classes[1] = 36; 
                            classes[2] = 56; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 164; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[7] <= 0.386159956455) {
                            classes[0] = 0; 
                            classes[1] = 175; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[22] <= 0.56310737133) {
                        if (features[18] <= 0.190577626228) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 442; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[16] <= 1.54310822487) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 12; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[13] <= 6.2551202774) {
                    if (features[32] <= 0.586599230766) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 368; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_70(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.498605489731) {
            if (features[14] <= 3580.5) {
                classes[0] = 603; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[14] <= 6230.0) {
                    if (features[17] <= 557.0) {
                        if (features[1] <= 0.474969089031) {
                            classes[0] = 0; 
                            classes[1] = 348; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[29] <= 0.55181312561) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[32] <= 0.516765236855) {
                        if (features[3] <= -0.0314168781042) {
                            classes[0] = 2; 
                            classes[1] = 28; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 51; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 3.35830020905) {
                            classes[0] = 7; 
                            classes[1] = 26; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 5.95776844025) {
                if (features[17] <= 1395.0) {
                    if (features[31] <= 0.88297444582) {
                        if (features[13] <= 5.70870304108) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 438; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 1; 
                        }
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 9; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[4] <= 1.91586518288) {
                    if (features[10] <= 3.37078094482) {
                        if (features[15] <= -3.55485749245) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 74; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 313; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_71(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 718.5) {
            if (features[1] <= 1.09243345261) {
                classes[0] = 579; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 20; 
            }
        } else {
            if (features[1] <= 0.423180669546) {
                if (features[15] <= -1.14921212196) {
                    if (features[0] <= -0.0260062497109) {
                        if (features[11] <= 56.0) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 3951.0) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 130; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[14] <= 2803.5) {
                        classes[0] = 11; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[29] <= 0.487743139267) {
                            classes[0] = 13; 
                            classes[1] = 90; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 193; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.79965341091) {
                    if (features[8] <= 70.5) {
                        if (features[1] <= 1.82559370995) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 398; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 25; 
                        }
                    } else {
                        if (features[0] <= -0.377223402262) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 25; 
                        }
                    }
                } else {
                    if (features[7] <= 0.888658761978) {
                        if (features[16] <= 5.17358255386) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 18; 
                        }
                    } else {
                        if (features[4] <= 1.89889287949) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 14; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 290; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_72(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.70870304108) {
            if (features[13] <= 1.38631367683) {
                if (features[17] <= 262.0) {
                    if (features[1] <= 0.00325994426385) {
                        classes[0] = 14; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[12] <= -10.0962533951) {
                            classes[0] = 14; 
                            classes[1] = 94; 
                            classes[2] = 62; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 25; 
                            classes[1] = 296; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -6.48748397827) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 547; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[9] <= 7.32313156128) {
                    if (features[16] <= 1.03049480915) {
                        classes[0] = 3; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[15] <= -5.82277488708) {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 436; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 13; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            classes[0] = 0; 
            classes[1] = 0; 
            classes[2] = 0; 
            classes[3] = 414; 
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_73(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.94364929199) {
            if (features[14] <= 3322.0) {
                classes[0] = 590; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[5] <= 0.5) {
                    if (features[7] <= 0.397510826588) {
                        if (features[15] <= -1.15236628056) {
                            classes[0] = 0; 
                            classes[1] = 103; 
                            classes[2] = 75; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 269; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 142; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[4] <= 0.139715909958) {
                        classes[0] = 0; 
                        classes[1] = 16; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[21] <= 0.199535146356) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 301; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[15] <= -4.34447383881) {
                if (features[3] <= 0.651390373707) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 1; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 401; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_74(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.70870304108) {
            if (features[4] <= 0.657121419907) {
                if (features[4] <= 0.0112042371184) {
                    if (features[15] <= -2.57927250862) {
                        classes[0] = 147; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[19] <= 0.834994673729) {
                            classes[0] = 128; 
                            classes[1] = 19; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 13; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= 0.00693125138059) {
                        if (features[3] <= -0.0421237722039) {
                            classes[0] = 115; 
                            classes[1] = 92; 
                            classes[2] = 17; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 72; 
                            classes[1] = 254; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[15] <= -3.41275882721) {
                            classes[0] = 73; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 50; 
                            classes[1] = 37; 
                            classes[2] = 43; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[16] <= 1.02800929546) {
                    if (features[9] <= 3.67286705971) {
                        if (features[31] <= 0.256287157536) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 4; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[7] <= 0.298414289951) {
                        if (features[12] <= -4.34381341934) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= -1.3872641325) {
                            classes[0] = 4; 
                            classes[1] = 1; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 440; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[20] <= 0.650144636631) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 387; 
            } else {
                if (features[11] <= -5.0) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 1; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 9; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_75(double[] features) {
        int[] classes = new int[4];
        
        if (features[11] <= 1332.5) {
            if (features[10] <= 3.41546702385) {
                if (features[15] <= 3.30058765411) {
                    if (features[16] <= 1.1197810173) {
                        if (features[0] <= -0.03409473598) {
                            classes[0] = 1; 
                            classes[1] = 17; 
                            classes[2] = 39; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 55; 
                            classes[1] = 400; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 1.09399676323) {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 401; 
                            classes[3] = 11; 
                        }
                    }
                } else {
                    classes[0] = 158; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[13] <= 5.51057529449) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 30; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 379; 
                }
            }
        } else {
            if (features[14] <= 2480.0) {
                classes[0] = 389; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                if (features[32] <= 0.570994377136) {
                    if (features[11] <= 1497.0) {
                        classes[0] = 0; 
                        classes[1] = 4; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 23; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 6; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_76(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.379305243492) {
            if (features[17] <= 262.0) {
                if (features[14] <= 2803.5) {
                    classes[0] = 39; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[11] <= 66.0) {
                        if (features[10] <= 0.0994899719954) {
                            classes[0] = 2; 
                            classes[1] = 54; 
                            classes[2] = 44; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 141; 
                            classes[2] = 13; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[16] <= 2.38166618347) {
                            classes[0] = 0; 
                            classes[1] = 227; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[1] <= 0.958253264427) {
                    if (features[12] <= -6.6663646698) {
                        if (features[6] <= -0.272789359093) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 545; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[10] <= 3.95260739326) {
                if (features[14] <= 3510.5) {
                    if (features[13] <= 5.99783802032) {
                        classes[0] = 19; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 11; 
                    }
                } else {
                    if (features[25] <= 0.340786874294) {
                        if (features[12] <= -0.163566112518) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        }
                    } else {
                        if (features[0] <= 0.544799029827) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 407; 
                            classes[3] = 16; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    }
                }
            } else {
                if (features[22] <= 0.373362898827) {
                    if (features[30] <= 0.591713428497) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 8; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[27] <= 0.629320144653) {
                        if (features[31] <= 0.744284749031) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 14; 
                            classes[3] = 346; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 6; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 2; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_77(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[7] <= 0.774048864841) {
                classes[0] = 585; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 21; 
            }
        } else {
            if (features[1] <= 0.474714756012) {
                if (features[1] <= 0.0325460806489) {
                    if (features[9] <= 1.34425878525) {
                        if (features[13] <= 0.0542715378106) {
                            classes[0] = 3; 
                            classes[1] = 104; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 16; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[11] <= 163.5) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 62; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 78; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 0.148817554116) {
                        if (features[6] <= -0.040607996285) {
                            classes[0] = 0; 
                            classes[1] = 21; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 4; 
                            classes[1] = 9; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[22] <= 0.774192810059) {
                            classes[0] = 1; 
                            classes[1] = 184; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 5007.5) {
                    if (features[16] <= 3.13705539703) {
                        if (features[12] <= -8.96654129028) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 45; 
                            classes[3] = 2; 
                        }
                    } else {
                        if (features[22] <= 0.336798995733) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 202; 
                        }
                    }
                } else {
                    if (features[13] <= 5.70870304108) {
                        if (features[13] <= 0.773240447044) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 396; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 150; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_78(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[11] <= -81.0) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 12; 
            } else {
                if (features[16] <= 4.28914451599) {
                    classes[0] = 557; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 10; 
                }
            }
        } else {
            if (features[14] <= 5157.5) {
                if (features[8] <= -2.5) {
                    if (features[1] <= 1.40125060081) {
                        if (features[6] <= 0.140245437622) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 123; 
                    }
                } else {
                    if (features[13] <= 1.2946754694) {
                        if (features[1] <= 0.00325994426385) {
                            classes[0] = 5; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 265; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 1.36074948311) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 54; 
                            classes[3] = 19; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 101; 
                        }
                    }
                }
            } else {
                if (features[16] <= 4.29704475403) {
                    if (features[0] <= -0.0297962315381) {
                        if (features[13] <= 6.29067611694) {
                            classes[0] = 4; 
                            classes[1] = 12; 
                            classes[2] = 235; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 9; 
                        }
                    } else {
                        if (features[13] <= 1.09852528572) {
                            classes[0] = 11; 
                            classes[1] = 140; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 207; 
                            classes[3] = 19; 
                        }
                    }
                } else {
                    if (features[10] <= 3.06587195396) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    } else {
                        if (features[19] <= 0.869194030762) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 104; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 12; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_79(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.503498733044) {
            if (features[3] <= -0.151228368282) {
                if (features[0] <= 3.57786250114) {
                    if (features[12] <= -6.08694458008) {
                        if (features[23] <= 0.999887108803) {
                            classes[0] = 0; 
                            classes[1] = 76; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[26] <= 0.417549401522) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 17; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[11] <= 1020.0) {
                    if (features[21] <= 0.5673609972) {
                        if (features[15] <= 4.67661714554) {
                            classes[0] = 33; 
                            classes[1] = 285; 
                            classes[2] = 49; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 85; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= 5.76973152161) {
                            classes[0] = 61; 
                            classes[1] = 13; 
                            classes[2] = 11; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 29; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[25] <= 0.885226845741) {
                        if (features[26] <= 0.789727210999) {
                            classes[0] = 403; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[12] <= -9.86874198914) {
                if (features[11] <= -75.0) {
                    if (features[17] <= 344.0) {
                        if (features[15] <= -0.925206899643) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 12; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[2] <= -78.0) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 5; 
                    } else {
                        if (features[10] <= 4.40015792847) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 235; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    }
                }
            } else {
                if (features[19] <= 0.132912814617) {
                    if (features[13] <= 5.14483261108) {
                        if (features[21] <= 0.414217710495) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 126; 
                    }
                } else {
                    if (features[15] <= -1.47558355331) {
                        if (features[12] <= 9.50939846039) {
                            classes[0] = 4; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 162; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 35; 
                            classes[3] = 6; 
                        }
                    } else {
                        if (features[5] <= -26.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 28; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 1; 
                            classes[2] = 152; 
                            classes[3] = 40; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_80(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.357850253582) {
            if (features[31] <= 0.512993097305) {
                if (features[16] <= 0.145770519972) {
                    if (features[9] <= 4.1460351944) {
                        if (features[4] <= 0.0257162414491) {
                            classes[0] = 84; 
                            classes[1] = 14; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 21; 
                            classes[1] = 18; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 229; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[24] <= 0.352762460709) {
                        if (features[14] <= 2467.5) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 20; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 3.60151576996) {
                            classes[0] = 31; 
                            classes[1] = 42; 
                            classes[2] = 2; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 33; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[0] <= -0.0302677601576) {
                    if (features[14] <= 2246.0) {
                        classes[0] = 52; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[10] <= 0.194444775581) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 41; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 16; 
                            classes[2] = 4; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[16] <= 0.0303015634418) {
                        if (features[14] <= 4095.0) {
                            classes[0] = 41; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[8] <= 1147.5) {
                            classes[0] = 65; 
                            classes[1] = 288; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 22; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[4] <= 1.93391060829) {
                if (features[17] <= -148.5) {
                    if (features[19] <= 0.534107208252) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 12; 
                    } else {
                        if (features[15] <= -0.275675237179) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[1] <= 2.09778237343) {
                        if (features[14] <= 3481.5) {
                            classes[0] = 16; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 7; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 443; 
                            classes[3] = 16; 
                        }
                    } else {
                        if (features[7] <= 0.761372983456) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 23; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.11421442032) {
                    if (features[29] <= 0.307988941669) {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 6; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[29] <= 0.527492582798) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 247; 
                    } else {
                        if (features[27] <= 0.501437187195) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 89; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 15; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_81(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.67492580414) {
            if (features[1] <= 0.501409828663) {
                if (features[6] <= 0.00644064508379) {
                    if (features[16] <= 0.0369537509978) {
                        if (features[12] <= 5.12523984909) {
                            classes[0] = 37; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 11; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= -0.0309747457504) {
                            classes[0] = 74; 
                            classes[1] = 175; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 157; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= -10.0918884277) {
                        if (features[4] <= 0.406529247761) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 60; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 0.113525986671) {
                            classes[0] = 82; 
                            classes[1] = 7; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 33; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[8] <= -10.5) {
                    if (features[16] <= 2.71145248413) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 11; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 120; 
                    }
                } else {
                    if (features[5] <= -43.5) {
                        if (features[13] <= 5.16651725769) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 76; 
                        }
                    } else {
                        if (features[10] <= 3.49267625809) {
                            classes[0] = 2; 
                            classes[1] = 2; 
                            classes[2] = 438; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 13; 
                            classes[3] = 182; 
                        }
                    }
                }
            }
        } else {
            if (features[12] <= -5.68778705597) {
                if (features[30] <= 0.796949744225) {
                    if (features[12] <= -8.75329208374) {
                        if (features[0] <= 0.116708032787) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 16; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 10; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 373; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_82(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 996.0) {
            if (features[5] <= 0.5) {
                if (features[7] <= 0.353708297014) {
                    if (features[14] <= 2803.5) {
                        classes[0] = 52; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[14] <= 6250.0) {
                            classes[0] = 0; 
                            classes[1] = 345; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 11; 
                            classes[1] = 28; 
                            classes[2] = 58; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[7] <= 0.99614071846) {
                        if (features[1] <= 0.355541080236) {
                            classes[0] = 3; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 138; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[5] <= -24.5) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 96; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 17; 
                            classes[3] = 31; 
                        }
                    }
                }
            } else {
                if (features[1] <= 1.76627254486) {
                    if (features[13] <= 5.40948724747) {
                        if (features[32] <= 0.308287143707) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 17; 
                            classes[2] = 320; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 62; 
                    }
                } else {
                    if (features[28] <= 0.511894226074) {
                        if (features[20] <= 0.688780546188) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 111; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 3.06587195396) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 63; 
                        }
                    }
                }
            }
        } else {
            if (features[11] <= -82.0) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 4; 
            } else {
                if (features[12] <= -5.77302360535) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 16; 
                } else {
                    if (features[7] <= 1.45192015171) {
                        classes[0] = 524; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 4; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_83(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.63160705566) {
            if (features[4] <= 0.671931862831) {
                if (features[4] <= 0.0119551727548) {
                    if (features[1] <= 0.000801227230113) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 10; 
                    } else {
                        if (features[29] <= 0.614115715027) {
                            classes[0] = 93; 
                            classes[1] = 13; 
                            classes[2] = 7; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 16; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[17] <= 1094.0) {
                        if (features[12] <= -9.06747817993) {
                            classes[0] = 9; 
                            classes[1] = 116; 
                            classes[2] = 61; 
                            classes[3] = 18; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 255; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 113; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[18] <= 0.374196171761) {
                    if (features[10] <= 3.22416448593) {
                        if (features[16] <= 1.12990665436) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 33; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 117; 
                    }
                } else {
                    if (features[16] <= 4.31190109253) {
                        if (features[16] <= 3.48891615868) {
                            classes[0] = 3; 
                            classes[1] = 4; 
                            classes[2] = 349; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 50; 
                            classes[3] = 26; 
                        }
                    } else {
                        if (features[7] <= 1.16820275784) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 11; 
                            classes[3] = 48; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 172; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 0.857939243317) {
                if (features[14] <= 3559.5) {
                    classes[0] = 340; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 18; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 30; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_84(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[4] <= 1.35880661011) {
                classes[0] = 564; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 0; 
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 22; 
            }
        } else {
            if (features[2] <= -60.5) {
                if (features[7] <= 0.618147373199) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                } else {
                    if (features[22] <= 0.336798995733) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 126; 
                    }
                }
            } else {
                if (features[7] <= 0.36450317502) {
                    if (features[7] <= 0.00777231156826) {
                        if (features[0] <= -0.0255274437368) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 45; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 15; 
                            classes[1] = 60; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[0] <= -0.0274843033403) {
                            classes[0] = 3; 
                            classes[1] = 32; 
                            classes[2] = 28; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 320; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[24] <= 0.415244311094) {
                        if (features[13] <= 5.21117210388) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 26; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 70; 
                        }
                    } else {
                        if (features[16] <= 4.57223510742) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 402; 
                            classes[3] = 22; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 164; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_85(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.507479906082) {
            if (features[4] <= 0.012014746666) {
                if (features[14] <= 3559.5) {
                    classes[0] = 277; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[15] <= -1.12673318386) {
                        if (features[6] <= 0.00933013297617) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 13; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[15] <= -2.47887277603) {
                    if (features[17] <= 806.5) {
                        if (features[12] <= -5.41274356842) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 6; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 128; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[12] <= 7.21893119812) {
                        if (features[12] <= -5.7789516449) {
                            classes[0] = 14; 
                            classes[1] = 190; 
                            classes[2] = 59; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 133; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[16] <= 0.950743436813) {
                            classes[0] = 0; 
                            classes[1] = 197; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 14; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[1] <= 1.80758023262) {
                if (features[16] <= 4.64049196243) {
                    if (features[19] <= 0.046838670969) {
                        classes[0] = 0; 
                        classes[1] = 3; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[4] <= 0.677228391171) {
                            classes[0] = 5; 
                            classes[1] = 1; 
                            classes[2] = 26; 
                            classes[3] = 25; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 422; 
                            classes[3] = 10; 
                        }
                    }
                } else {
                    if (features[9] <= -0.283974170685) {
                        if (features[13] <= 6.66143465042) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 52; 
                    }
                }
            } else {
                if (features[7] <= 0.708345890045) {
                    if (features[30] <= 0.61284917593) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 5; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 3; 
                    }
                } else {
                    if (features[19] <= 0.939457774162) {
                        if (features[13] <= 5.40331268311) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 312; 
                        }
                    } else {
                        if (features[17] <= 520.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_86(double[] features) {
        int[] classes = new int[4];
        
        if (features[7] <= 0.379305243492) {
            if (features[12] <= 8.17576694489) {
                if (features[31] <= 0.668550252914) {
                    if (features[16] <= 0.0908651351929) {
                        if (features[6] <= 0.0104242283851) {
                            classes[0] = 324; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 84; 
                            classes[1] = 0; 
                            classes[2] = 30; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 360.0) {
                            classes[0] = 17; 
                            classes[1] = 100; 
                            classes[2] = 22; 
                            classes[3] = 3; 
                        } else {
                            classes[0] = 148; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                } else {
                    if (features[17] <= 869.0) {
                        if (features[0] <= -0.0354691818357) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 94; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 36; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[1] <= 0.698885917664) {
                    classes[0] = 0; 
                    classes[1] = 203; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[8] <= -8.5) {
                if (features[13] <= 5.5921869278) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 21; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 140; 
                }
            } else {
                if (features[16] <= 4.0109500885) {
                    if (features[17] <= 738.5) {
                        if (features[1] <= 1.95842456818) {
                            classes[0] = 3; 
                            classes[1] = 6; 
                            classes[2] = 396; 
                            classes[3] = 13; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 13; 
                        }
                    } else {
                        classes[0] = 15; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[12] <= -10.0176153183) {
                        if (features[28] <= 0.641453385353) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 23; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[4] <= 1.43549346924) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 5; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 203; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_87(double[] features) {
        int[] classes = new int[4];
        
        if (features[9] <= 4.63562583923) {
            if (features[17] <= 1540.0) {
                if (features[10] <= 3.49267625809) {
                    if (features[5] <= 0.5) {
                        if (features[1] <= 0.616513490677) {
                            classes[0] = 11; 
                            classes[1] = 400; 
                            classes[2] = 65; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 139; 
                            classes[3] = 3; 
                        }
                    } else {
                        if (features[1] <= 0.402859121561) {
                            classes[0] = 0; 
                            classes[1] = 20; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 250; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[14] <= 4711.0) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 207; 
                    } else {
                        if (features[1] <= 1.00873410702) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 23; 
                            classes[3] = 13; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 162; 
                        }
                    }
                }
            } else {
                if (features[10] <= 2.67711853981) {
                    classes[0] = 230; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 5; 
                }
            }
        } else {
            if (features[17] <= -10.0) {
                if (features[23] <= 0.5746986866) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 15; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 2; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[0] <= -0.149310290813) {
                    if (features[31] <= 0.499652028084) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 8; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[31] <= 0.905069172382) {
                        if (features[17] <= 4.0) {
                            classes[0] = 17; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 335; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_88(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1018.5) {
            if (features[8] <= 11.0) {
                if (features[26] <= 0.574146986008) {
                    classes[0] = 428; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[0] <= 0.229692190886) {
                        if (features[5] <= 1.0) {
                            classes[0] = 116; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 3; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                }
            } else {
                if (features[11] <= 1433.5) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 12; 
                } else {
                    classes[0] = 12; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[1] <= 0.502808868885) {
                if (features[0] <= -0.0308883227408) {
                    if (features[7] <= 0.0404885597527) {
                        if (features[10] <= 0.198962211609) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 50; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 29; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[4] <= 0.00621305080131) {
                        if (features[11] <= 839.5) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6231.0) {
                            classes[0] = 3; 
                            classes[1] = 352; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 34; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[16] <= 3.92672991753) {
                    if (features[0] <= 0.532994508743) {
                        if (features[15] <= 0.293546229601) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 432; 
                            classes[3] = 18; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 5; 
                            classes[3] = 11; 
                        }
                    } else {
                        if (features[6] <= 1.89586162567) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[16] <= 4.76986026764) {
                        if (features[7] <= 0.985229849815) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 18; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 68; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 285; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_89(double[] features) {
        int[] classes = new int[4];
        
        if (features[16] <= 1.06638920307) {
            if (features[12] <= 8.17576694489) {
                if (features[11] <= 1500.5) {
                    if (features[17] <= 1094.0) {
                        if (features[14] <= 6250.0) {
                            classes[0] = 5; 
                            classes[1] = 168; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 43; 
                            classes[2] = 67; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 187; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 2803.5) {
                        classes[0] = 325; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 2; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 215; 
                classes[2] = 0; 
                classes[3] = 0; 
            }
        } else {
            if (features[10] <= 3.49267625809) {
                if (features[14] <= 995.5) {
                    classes[0] = 39; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[13] <= 5.42212295532) {
                        if (features[19] <= 0.0379415750504) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 15; 
                            classes[2] = 393; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 15; 
                    }
                }
            } else {
                if (features[11] <= 1512.0) {
                    if (features[12] <= 9.56500244141) {
                        if (features[25] <= 0.628369152546) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 7; 
                            classes[3] = 377; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 1; 
                        }
                    } else {
                        if (features[4] <= 2.04138040543) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 18; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 12; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 19; 
                    classes[3] = 0; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_90(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 3.5011177063) {
            if (features[9] <= 4.67492580414) {
                if (features[16] <= 1.18193650246) {
                    if (features[9] <= -2.92747688293) {
                        classes[0] = 94; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[6] <= 0.00178400869481) {
                            classes[0] = 31; 
                            classes[1] = 349; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 83; 
                            classes[1] = 44; 
                            classes[2] = 61; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[23] <= 0.0753136128187) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 6; 
                    } else {
                        if (features[28] <= 0.728648841381) {
                            classes[0] = 0; 
                            classes[1] = 9; 
                            classes[2] = 379; 
                            classes[3] = 15; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 2.30341553688) {
                    if (features[1] <= 0.0230853334069) {
                        classes[0] = 238; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[9] <= 5.66590213776) {
                            classes[0] = 30; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 93; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[23] <= 0.375905811787) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 9; 
                        classes[3] = 0; 
                    }
                }
            }
        } else {
            if (features[11] <= 1496.5) {
                if (features[9] <= 2.34301137924) {
                    if (features[29] <= 0.649306297302) {
                        if (features[4] <= 1.68289899826) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 47; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 340; 
                        }
                    } else {
                        if (features[1] <= 0.706563472748) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 14; 
                        }
                    }
                } else {
                    if (features[16] <= 4.06056547165) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 21; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 25; 
                    }
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 17; 
                classes[3] = 0; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_91(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 996.0) {
            if (features[7] <= 0.335940718651) {
                if (features[13] <= 0.014962291345) {
                    if (features[14] <= 3339.0) {
                        classes[0] = 35; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 7; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    if (features[14] <= 6250.0) {
                        if (features[1] <= 0.00441380031407) {
                            classes[0] = 10; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 13; 
                            classes[1] = 321; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[11] <= 62.0) {
                            classes[0] = 11; 
                            classes[1] = 28; 
                            classes[2] = 1; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 57; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[10] <= 3.54414319992) {
                    if (features[1] <= 0.385055541992) {
                        if (features[4] <= 0.154674232006) {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 9; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 6.3945608139) {
                            classes[0] = 1; 
                            classes[1] = 9; 
                            classes[2] = 439; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        }
                    }
                } else {
                    if (features[29] <= 0.622156977654) {
                        if (features[16] <= 3.13622045517) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 24; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 356; 
                        }
                    } else {
                        if (features[20] <= 0.512451767921) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 10; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 8; 
                            classes[3] = 2; 
                        }
                    }
                }
            }
        } else {
            if (features[12] <= -5.77302360535) {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 16; 
            } else {
                if (features[4] <= 1.7341170311) {
                    classes[0] = 523; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 3; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_92(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.31687831879) {
            if (features[10] <= 0.0385241433978) {
                if (features[12] <= 8.20524787903) {
                    if (features[1] <= 0.00764426682144) {
                        classes[0] = 233; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[1] <= 0.0083882054314) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 19; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[15] <= 3.84853196144) {
                    if (features[23] <= 0.806694507599) {
                        if (features[30] <= 0.580266416073) {
                            classes[0] = 109; 
                            classes[1] = 151; 
                            classes[2] = 32; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 37; 
                            classes[1] = 236; 
                            classes[2] = 27; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[3] <= -5.2337474823) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 12; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 169; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[1] <= 1.70337915421) {
                if (features[4] <= 2.04894399643) {
                    if (features[13] <= 5.40948724747) {
                        if (features[1] <= 0.530741810799) {
                            classes[0] = 19; 
                            classes[1] = 3; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 423; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 33; 
                    }
                } else {
                    if (features[13] <= 6.12009048462) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 7; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 42; 
                    }
                }
            } else {
                if (features[16] <= 2.36517524719) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 2; 
                    classes[3] = 0; 
                } else {
                    if (features[12] <= -10.0406494141) {
                        if (features[7] <= 1.13357102871) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 10; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        }
                    } else {
                        if (features[3] <= 1.21455287933) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 317; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 13; 
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_93(double[] features) {
        int[] classes = new int[4];
        
        if (features[17] <= 996.0) {
            if (features[13] <= 5.89318132401) {
                if (features[4] <= 0.673949122429) {
                    if (features[1] <= 0.00465465988964) {
                        if (features[14] <= 3339.0) {
                            classes[0] = 43; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 12; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[9] <= 7.09330701828) {
                            classes[0] = 15; 
                            classes[1] = 379; 
                            classes[2] = 76; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 26; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[11] <= 3604.0) {
                        if (features[27] <= 0.790120303631) {
                            classes[0] = 0; 
                            classes[1] = 7; 
                            classes[2] = 462; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 2; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[15] <= -4.37982177734) {
                    if (features[18] <= 0.546403169632) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 1; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 351; 
                }
            }
        } else {
            if (features[17] <= 1512.5) {
                if (features[15] <= -3.50068855286) {
                    classes[0] = 13; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 13; 
                }
            } else {
                if (features[16] <= 5.08218097687) {
                    classes[0] = 521; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 7; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_94(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 1.38631367683) {
            if (features[9] <= 4.80431747437) {
                if (features[14] <= 2152.0) {
                    classes[0] = 225; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[10] <= 0.0878039672971) {
                        if (features[0] <= -0.0251686796546) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 43; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 103; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 6250.0) {
                            classes[0] = 1; 
                            classes[1] = 256; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 8; 
                            classes[1] = 27; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 3580.5) {
                    classes[0] = 358; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 10; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[4] <= 1.95664763451) {
                if (features[10] <= 3.9421710968) {
                    if (features[6] <= -2.03876924515) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 8; 
                    } else {
                        if (features[30] <= 0.172933101654) {
                            classes[0] = 2; 
                            classes[1] = 2; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 5; 
                            classes[1] = 1; 
                            classes[2] = 456; 
                            classes[3] = 9; 
                        }
                    }
                } else {
                    if (features[24] <= 0.613718867302) {
                        if (features[13] <= 5.01453828812) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 9; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 63; 
                        }
                    } else {
                        if (features[1] <= 1.55275082588) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 14; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 1; 
                        }
                    }
                }
            } else {
                if (features[13] <= 5.11699438095) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 15; 
                    classes[3] = 0; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 293; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_95(double[] features) {
        int[] classes = new int[4];
        
        if (features[10] <= 1.31687831879) {
            if (features[4] <= 0.0118467425928) {
                if (features[12] <= 8.22222042084) {
                    if (features[12] <= -5.66152715683) {
                        if (features[30] <= 0.669770717621) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 5; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 282; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 22; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            } else {
                if (features[11] <= 1330.5) {
                    if (features[31] <= 0.658289134502) {
                        if (features[0] <= -0.0308883227408) {
                            classes[0] = 21; 
                            classes[1] = 8; 
                            classes[2] = 42; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 85; 
                            classes[1] = 207; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[6] <= 0.000861386128236) {
                            classes[0] = 4; 
                            classes[1] = 176; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 8; 
                            classes[2] = 6; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[30] <= 0.84833574295) {
                        if (features[11] <= 1505.5) {
                            classes[0] = 11; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 120; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[17] <= 1536.5) {
                            classes[0] = 0; 
                            classes[1] = 6; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 3; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[22] <= 0.486009001732) {
                if (features[16] <= 4.38306808472) {
                    if (features[15] <= -3.52006530762) {
                        classes[0] = 14; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[16] <= 0.997614860535) {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 1; 
                            classes[1] = 1; 
                            classes[2] = 344; 
                            classes[3] = 13; 
                        }
                    }
                } else {
                    if (features[27] <= 0.606469750404) {
                        if (features[13] <= 6.66132545471) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 148; 
                        }
                    } else {
                        if (features[13] <= 7.37481021881) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        }
                    }
                }
            } else {
                if (features[12] <= -9.89427089691) {
                    if (features[12] <= -10.4172992706) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 9; 
                    } else {
                        if (features[18] <= 0.62678539753) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 46; 
                            classes[3] = 1; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    }
                } else {
                    if (features[13] <= 5.55833148956) {
                        if (features[14] <= 2178.0) {
                            classes[0] = 19; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 4; 
                            classes[2] = 45; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 240; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_96(double[] features) {
        int[] classes = new int[4];
        
        if (features[14] <= 1582.5) {
            if (features[2] <= 3.0) {
                if (features[12] <= 6.54593753815) {
                    if (features[4] <= 1.93940448761) {
                        classes[0] = 564; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 7; 
                }
            } else {
                if (features[14] <= 382.5) {
                    if (features[10] <= 3.73440074921) {
                        classes[0] = 22; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 2; 
                    }
                } else {
                    if (features[15] <= -4.7155418396) {
                        classes[0] = 1; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 21; 
                    }
                }
            }
        } else {
            if (features[7] <= 0.335940718651) {
                if (features[12] <= -10.0918884277) {
                    if (features[6] <= -0.00800195522606) {
                        if (features[20] <= 0.532322764397) {
                            classes[0] = 12; 
                            classes[1] = 48; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 48; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[12] <= -10.1369781494) {
                            classes[0] = 0; 
                            classes[1] = 3; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 68; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[6] <= -0.296208292246) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 7; 
                    } else {
                        if (features[14] <= 3580.5) {
                            classes[0] = 5; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 331; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[2] <= 53.5) {
                    if (features[16] <= 4.37832260132) {
                        if (features[5] <= 77.0) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 433; 
                            classes[3] = 19; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 15; 
                            classes[3] = 20; 
                        }
                    } else {
                        if (features[23] <= 0.744578897953) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 160; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 2; 
                            classes[3] = 2; 
                        }
                    }
                } else {
                    if (features[13] <= 5.62284469604) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 9; 
                        classes[3] = 0; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 110; 
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_97(double[] features) {
        int[] classes = new int[4];
        
        if (features[13] <= 5.42212295532) {
            if (features[7] <= 0.357850253582) {
                if (features[1] <= 0.00683355377987) {
                    if (features[22] <= 0.305694848299) {
                        if (features[9] <= 0.861855685711) {
                            classes[0] = 1; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[14] <= 3339.0) {
                            classes[0] = 255; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 19; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[12] <= 8.20201206207) {
                        if (features[11] <= 1345.0) {
                            classes[0] = 136; 
                            classes[1] = 204; 
                            classes[2] = 62; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 175; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[1] <= 0.644254565239) {
                            classes[0] = 0; 
                            classes[1] = 177; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 1; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[14] <= 2136.0) {
                    classes[0] = 21; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[29] <= 0.726138472557) {
                        if (features[16] <= 0.60817605257) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 465; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[13] <= 1.05523061752) {
                            classes[0] = 0; 
                            classes[1] = 8; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 3; 
                            classes[3] = 0; 
                        }
                    }
                }
            }
        } else {
            if (features[13] <= 6.2551202774) {
                if (features[26] <= 0.524259626865) {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 5; 
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 3; 
                    classes[3] = 0; 
                }
            } else {
                classes[0] = 0; 
                classes[1] = 0; 
                classes[2] = 0; 
                classes[3] = 384; 
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_98(double[] features) {
        int[] classes = new int[4];
        
        if (features[1] <= 0.481204628944) {
            if (features[15] <= -2.45390939713) {
                if (features[14] <= 4116.0) {
                    classes[0] = 302; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[27] <= 0.561606705189) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 5; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    }
                }
            } else {
                if (features[12] <= 7.1926856041) {
                    if (features[14] <= 2803.5) {
                        classes[0] = 274; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 0; 
                    } else {
                        if (features[3] <= -0.00517569947988) {
                            classes[0] = 5; 
                            classes[1] = 138; 
                            classes[2] = 10; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 10; 
                            classes[1] = 39; 
                            classes[2] = 45; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 237; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                }
            }
        } else {
            if (features[1] <= 1.81824147701) {
                if (features[4] <= 2.00202798843) {
                    if (features[14] <= 3043.0) {
                        if (features[8] <= 35.5) {
                            classes[0] = 7; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 5; 
                        }
                    } else {
                        if (features[28] <= 0.764645814896) {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 419; 
                            classes[3] = 26; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 5; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[19] <= 0.361152082682) {
                        if (features[32] <= 0.521645784378) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 6; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 0; 
                        }
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 42; 
                    }
                }
            } else {
                if (features[13] <= 6.35976219177) {
                    if (features[20] <= 0.430231332779) {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 0; 
                        classes[3] = 1; 
                    } else {
                        classes[0] = 0; 
                        classes[1] = 0; 
                        classes[2] = 9; 
                        classes[3] = 0; 
                    }
                } else {
                    classes[0] = 0; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 334; 
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static int predict_99(double[] features) {
        int[] classes = new int[4];
        
        if (features[15] <= 3.30058765411) {
            if (features[1] <= 0.507479906082) {
                if (features[14] <= 3580.5) {
                    classes[0] = 321; 
                    classes[1] = 0; 
                    classes[2] = 0; 
                    classes[3] = 0; 
                } else {
                    if (features[6] <= 0.00644064508379) {
                        if (features[1] <= 0.00113256392069) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 4; 
                        } else {
                            classes[0] = 14; 
                            classes[1] = 352; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[10] <= 0.185346573591) {
                            classes[0] = 0; 
                            classes[1] = 13; 
                            classes[2] = 48; 
                            classes[3] = 0; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 27; 
                            classes[2] = 2; 
                            classes[3] = 0; 
                        }
                    }
                }
            } else {
                if (features[4] <= 1.75743293762) {
                    if (features[32] <= 0.734100818634) {
                        if (features[14] <= 3043.0) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 11; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 2; 
                            classes[2] = 436; 
                            classes[3] = 22; 
                        }
                    } else {
                        if (features[21] <= 0.638984918594) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 8; 
                        } else {
                            classes[0] = 2; 
                            classes[1] = 0; 
                            classes[2] = 0; 
                            classes[3] = 0; 
                        }
                    }
                } else {
                    if (features[10] <= 3.35756492615) {
                        if (features[32] <= 0.416539788246) {
                            classes[0] = 0; 
                            classes[1] = 1; 
                            classes[2] = 0; 
                            classes[3] = 2; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 28; 
                            classes[3] = 0; 
                        }
                    } else {
                        if (features[4] <= 1.83076477051) {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 4; 
                            classes[3] = 15; 
                        } else {
                            classes[0] = 0; 
                            classes[1] = 0; 
                            classes[2] = 5; 
                            classes[3] = 341; 
                        }
                    }
                }
            }
        } else {
            classes[0] = 270; 
            classes[1] = 0; 
            classes[2] = 0; 
            classes[3] = 0; 
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 4; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }
    
    public static String predict(double[] features) {
        int n_classes = 4;
        int[] classes = new int[n_classes];
        classes[RandomForestClassifier.predict_0(features)]++;
        classes[RandomForestClassifier.predict_1(features)]++;
        classes[RandomForestClassifier.predict_2(features)]++;
        classes[RandomForestClassifier.predict_3(features)]++;
        classes[RandomForestClassifier.predict_4(features)]++;
        classes[RandomForestClassifier.predict_5(features)]++;
        classes[RandomForestClassifier.predict_6(features)]++;
        classes[RandomForestClassifier.predict_7(features)]++;
        classes[RandomForestClassifier.predict_8(features)]++;
        classes[RandomForestClassifier.predict_9(features)]++;
        classes[RandomForestClassifier.predict_10(features)]++;
        classes[RandomForestClassifier.predict_11(features)]++;
        classes[RandomForestClassifier.predict_12(features)]++;
        classes[RandomForestClassifier.predict_13(features)]++;
        classes[RandomForestClassifier.predict_14(features)]++;
        classes[RandomForestClassifier.predict_15(features)]++;
        classes[RandomForestClassifier.predict_16(features)]++;
        classes[RandomForestClassifier.predict_17(features)]++;
        classes[RandomForestClassifier.predict_18(features)]++;
        classes[RandomForestClassifier.predict_19(features)]++;
        classes[RandomForestClassifier.predict_20(features)]++;
        classes[RandomForestClassifier.predict_21(features)]++;
        classes[RandomForestClassifier.predict_22(features)]++;
        classes[RandomForestClassifier.predict_23(features)]++;
        classes[RandomForestClassifier.predict_24(features)]++;
        classes[RandomForestClassifier.predict_25(features)]++;
        classes[RandomForestClassifier.predict_26(features)]++;
        classes[RandomForestClassifier.predict_27(features)]++;
        classes[RandomForestClassifier.predict_28(features)]++;
        classes[RandomForestClassifier.predict_29(features)]++;
        classes[RandomForestClassifier.predict_30(features)]++;
        classes[RandomForestClassifier.predict_31(features)]++;
        classes[RandomForestClassifier.predict_32(features)]++;
        classes[RandomForestClassifier.predict_33(features)]++;
        classes[RandomForestClassifier.predict_34(features)]++;
        classes[RandomForestClassifier.predict_35(features)]++;
        classes[RandomForestClassifier.predict_36(features)]++;
        classes[RandomForestClassifier.predict_37(features)]++;
        classes[RandomForestClassifier.predict_38(features)]++;
        classes[RandomForestClassifier.predict_39(features)]++;
        classes[RandomForestClassifier.predict_40(features)]++;
        classes[RandomForestClassifier.predict_41(features)]++;
        classes[RandomForestClassifier.predict_42(features)]++;
        classes[RandomForestClassifier.predict_43(features)]++;
        classes[RandomForestClassifier.predict_44(features)]++;
        classes[RandomForestClassifier.predict_45(features)]++;
        classes[RandomForestClassifier.predict_46(features)]++;
        classes[RandomForestClassifier.predict_47(features)]++;
        classes[RandomForestClassifier.predict_48(features)]++;
        classes[RandomForestClassifier.predict_49(features)]++;
        classes[RandomForestClassifier.predict_50(features)]++;
        classes[RandomForestClassifier.predict_51(features)]++;
        classes[RandomForestClassifier.predict_52(features)]++;
        classes[RandomForestClassifier.predict_53(features)]++;
        classes[RandomForestClassifier.predict_54(features)]++;
        classes[RandomForestClassifier.predict_55(features)]++;
        classes[RandomForestClassifier.predict_56(features)]++;
        classes[RandomForestClassifier.predict_57(features)]++;
        classes[RandomForestClassifier.predict_58(features)]++;
        classes[RandomForestClassifier.predict_59(features)]++;
        classes[RandomForestClassifier.predict_60(features)]++;
        classes[RandomForestClassifier.predict_61(features)]++;
        classes[RandomForestClassifier.predict_62(features)]++;
        classes[RandomForestClassifier.predict_63(features)]++;
        classes[RandomForestClassifier.predict_64(features)]++;
        classes[RandomForestClassifier.predict_65(features)]++;
        classes[RandomForestClassifier.predict_66(features)]++;
        classes[RandomForestClassifier.predict_67(features)]++;
        classes[RandomForestClassifier.predict_68(features)]++;
        classes[RandomForestClassifier.predict_69(features)]++;
        classes[RandomForestClassifier.predict_70(features)]++;
        classes[RandomForestClassifier.predict_71(features)]++;
        classes[RandomForestClassifier.predict_72(features)]++;
        classes[RandomForestClassifier.predict_73(features)]++;
        classes[RandomForestClassifier.predict_74(features)]++;
        classes[RandomForestClassifier.predict_75(features)]++;
        classes[RandomForestClassifier.predict_76(features)]++;
        classes[RandomForestClassifier.predict_77(features)]++;
        classes[RandomForestClassifier.predict_78(features)]++;
        classes[RandomForestClassifier.predict_79(features)]++;
        classes[RandomForestClassifier.predict_80(features)]++;
        classes[RandomForestClassifier.predict_81(features)]++;
        classes[RandomForestClassifier.predict_82(features)]++;
        classes[RandomForestClassifier.predict_83(features)]++;
        classes[RandomForestClassifier.predict_84(features)]++;
        classes[RandomForestClassifier.predict_85(features)]++;
        classes[RandomForestClassifier.predict_86(features)]++;
        classes[RandomForestClassifier.predict_87(features)]++;
        classes[RandomForestClassifier.predict_88(features)]++;
        classes[RandomForestClassifier.predict_89(features)]++;
        classes[RandomForestClassifier.predict_90(features)]++;
        classes[RandomForestClassifier.predict_91(features)]++;
        classes[RandomForestClassifier.predict_92(features)]++;
        classes[RandomForestClassifier.predict_93(features)]++;
        classes[RandomForestClassifier.predict_94(features)]++;
        classes[RandomForestClassifier.predict_95(features)]++;
        classes[RandomForestClassifier.predict_96(features)]++;
        classes[RandomForestClassifier.predict_97(features)]++;
        classes[RandomForestClassifier.predict_98(features)]++;
        classes[RandomForestClassifier.predict_99(features)]++;
    
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < n_classes; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        // Add 2 to class_idx to get accurate class prediction
        String[] Classes = {"Sitting","Standing","Walking","Running"};
        return Classes[class_idx];
        //return class_idx+2;
    }

    public static int main(String[] args) {
        if (args.length == 33) {

            // Features:
            double[] features = new double[args.length];
            for (int i = 0, l = args.length; i < l; i++) {
                features[i] = Double.parseDouble(args[i]);
            }

            // Prediction:
            //int prediction = RandomForestClassifier.predict(features);
            String prediction = RandomForestClassifier.predict(features);
            //System.out.println(prediction);
            Log.i("Prediction",String.valueOf(prediction));
            //return prediction;
            return 0;

        }
        return 69;
    }
}