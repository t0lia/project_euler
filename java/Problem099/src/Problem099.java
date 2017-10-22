import java.lang.Math;

public class Problem099 {
	public static long[] rank(int val, int exp) {
		long current= val;
		long[] result = new long[2];
		int rank = 0;
		for (int i = 1; i < exp; i++) {
			if (current > Integer.MAX_VALUE) {
				current /= 1000000;
				rank += 6;
			}
			current *= val;
		}
		result[0] = current;
		result[1] = rank;

		return result;
	}
	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		int[][] matrix = {

{519432,525806,0},
{632382,518061,0},
{78864,613712,0},
{466580,530130,0},
{780495,510032,0},
{525895,525320,0},
{15991,714883,0},
{960290,502358,0},
{760018,511029,0},
{166800,575487,0},
{210884,564478,0},
{555151,523163,0},
{681146,515199,0},
{563395,522587,0},
{738250,512126,0},
{923525,503780,0},
{595148,520429,0},
{177108,572629,0},
{750923,511482,0},
{440902,532446,0},
{881418,505504,0},
{422489,534197,0},
{979858,501616,0},
{685893,514935,0},
{747477,511661,0},
{167214,575367,0},
{234140,559696,0},
{940238,503122,0},
{728969,512609,0},
{232083,560102,0},
{900971,504694,0},
{688801,514772,0},
{189664,569402,0},
{891022,505104,0},
{445689,531996,0},
{119570,591871,0},
{821453,508118,0},
{371084,539600,0},
{911745,504251,0},
{623655,518600,0},
{144361,582486,0},
{352442,541775,0},
{420726,534367,0},
{295298,549387,0},
{6530,787777,0},
{468397,529976,0},
{672336,515696,0},
{431861,533289,0},
{84228,610150,0},
{805376,508857,0},
{444409,532117,0},
{33833,663511,0},
{381850,538396,0},
{402931,536157,0},
{92901,604930,0},
{304825,548004,0},
{731917,512452,0},
{753734,511344,0},
{51894,637373,0},
{151578,580103,0},
{295075,549421,0},
{303590,548183,0},
{333594,544123,0},
{683952,515042,0},
{60090,628880,0},
{951420,502692,0},
{28335,674991,0},
{714940,513349,0},
{343858,542826,0},
{549279,523586,0},
{804571,508887,0},
{260653,554881,0},
{291399,549966,0},
{402342,536213,0},
{408889,535550,0},
{40328,652524,0},
{375856,539061,0},
{768907,510590,0},
{165993,575715,0},
{976327,501755,0},
{898500,504795,0},
{360404,540830,0},
{478714,529095,0},
{694144,514472,0},
{488726,528258,0},
{841380,507226,0},
{328012,544839,0},
{22389,690868,0},
{604053,519852,0},
{329514,544641,0},
{772965,510390,0},
{492798,527927,0},
{30125,670983,0},
{895603,504906,0},
{450785,531539,0},
{840237,507276,0},
{380711,538522,0},
{63577,625673,0},
{76801,615157,0},
{502694,527123,0},
{597706,520257,0},
{310484,547206,0},
{944468,502959,0},
{121283,591152,0},
{451131,531507,0},
{566499,522367,0},
{425373,533918,0},
{40240,652665,0},
{39130,654392,0},
{714926,513355,0},
{469219,529903,0},
{806929,508783,0},
{287970,550487,0},
{92189,605332,0},
{103841,599094,0},
{671839,515725,0},
{452048,531421,0},
{987837,501323,0},
{935192,503321,0},
{88585,607450,0},
{613883,519216,0},
{144551,582413,0},
{647359,517155,0},
{213902,563816,0},
{184120,570789,0},
{258126,555322,0},
{502546,527130,0},
{407655,535678,0},
{401528,536306,0},
{477490,529193,0},
{841085,507237,0},
{732831,512408,0},
{833000,507595,0},
{904694,504542,0},
{581435,521348,0},
{455545,531110,0},
{873558,505829,0},
{94916,603796,0},
{720176,513068,0},
{545034,523891,0},
{246348,557409,0},
{556452,523079,0},
{832015,507634,0},
{173663,573564,0},
{502634,527125,0},
{250732,556611,0},
{569786,522139,0},
{216919,563178,0},
{521815,525623,0},
{92304,605270,0},
{164446,576167,0},
{753413,511364,0},
{11410,740712,0},
{448845,531712,0},
{925072,503725,0},
{564888,522477,0},
{7062,780812,0},
{641155,517535,0},
{738878,512100,0},
{636204,517828,0},
{372540,539436,0},
{443162,532237,0},
{571192,522042,0},
{655350,516680,0},
{299741,548735,0},
{581914,521307,0},
{965471,502156,0},
{513441,526277,0},
{808682,508700,0},
{237589,559034,0},
{543300,524025,0},
{804712,508889,0},
{247511,557192,0},
{543486,524008,0},
{504383,526992,0},
{326529,545039,0},
{792493,509458,0},
{86033,609017,0},
{126554,589005,0},
{579379,521481,0},
{948026,502823,0},
{404777,535969,0},
{265767,554022,0},
{266876,553840,0},
{46631,643714,0},
{492397,527958,0},
{856106,506581,0},
{795757,509305,0},
{748946,511584,0},
{294694,549480,0},
{409781,535463,0},
{775887,510253,0},
{543747,523991,0},
{210592,564536,0},
{517119,525990,0},
{520253,525751,0},
{247926,557124,0},
{592141,520626,0},
{346580,542492,0},
{544969,523902,0},
{506501,526817,0},
{244520,557738,0},
{144745,582349,0},
{69274,620858,0},
{292620,549784,0},
{926027,503687,0},
{736320,512225,0},
{515528,526113,0},
{407549,535688,0},
{848089,506927,0},
{24141,685711,0},
{9224,757964,0},
{980684,501586,0},
{175259,573121,0},
{489160,528216,0},
{878970,505604,0},
{969546,502002,0},
{525207,525365,0},
{690461,514675,0},
{156510,578551,0},
{659778,516426,0},
{468739,529945,0},
{765252,510770,0},
{76703,615230,0},
{165151,575959,0},
{29779,671736,0},
{928865,503569,0},
{577538,521605,0},
{927555,503618,0},
{185377,570477,0},
{974756,501809,0},
{800130,509093,0},
{217016,563153,0},
{365709,540216,0},
{774508,510320,0},
{588716,520851,0},
{631673,518104,0},
{954076,502590,0},
{777828,510161,0},
{990659,501222,0},
{597799,520254,0},
{786905,509727,0},
{512547,526348,0},
{756449,511212,0},
{869787,505988,0},
{653747,516779,0},
{84623,609900,0},
{839698,507295,0},
{30159,670909,0},
{797275,509234,0},
{678136,515373,0},
{897144,504851,0},
{989554,501263,0},
{413292,535106,0},
{55297,633667,0},
{788650,509637,0},
{486748,528417,0},
{150724,580377,0},
{56434,632490,0},
{77207,614869,0},
{588631,520859,0},
{611619,519367,0},
{100006,601055,0},
{528924,525093,0},
{190225,569257,0},
{851155,506789,0},
{682593,515114,0},
{613043,519275,0},
{514673,526183,0},
{877634,505655,0},
{878905,505602,0},
{1926,914951,0},
{613245,519259,0},
{152481,579816,0},
{841774,507203,0},
{71060,619442,0},
{865335,506175,0},
{90244,606469,0},
{302156,548388,0},
{399059,536557,0},
{478465,529113,0},
{558601,522925,0},
{69132,620966,0},
{267663,553700,0},
{988276,501310,0},
{378354,538787,0},
{529909,525014,0},
{161733,576968,0},
{758541,511109,0},
{823425,508024,0},
{149821,580667,0},
{269258,553438,0},
{481152,528891,0},
{120871,591322,0},
{972322,501901,0},
{981350,501567,0},
{676129,515483,0},
{950860,502717,0},
{119000,592114,0},
{392252,537272,0},
{191618,568919,0},
{946699,502874,0},
{289555,550247,0},
{799322,509139,0},
{703886,513942,0},
{194812,568143,0},
{261823,554685,0},
{203052,566221,0},
{217330,563093,0},
{734748,512313,0},
{391759,537328,0},
{807052,508777,0},
{564467,522510,0},
{59186,629748,0},
{113447,594545,0},
{518063,525916,0},
{905944,504492,0},
{613922,519213,0},
{439093,532607,0},
{445946,531981,0},
{230530,560399,0},
{297887,549007,0},
{459029,530797,0},
{403692,536075,0},
{855118,506616,0},
{963127,502245,0},
{841711,507208,0},
{407411,535699,0},
{924729,503735,0},
{914823,504132,0},
{333725,544101,0},
{176345,572832,0},
{912507,504225,0},
{411273,535308,0},
{259774,555036,0},
{632853,518038,0},
{119723,591801,0},
{163902,576321,0},
{22691,689944,0},
{402427,536212,0},
{175769,572988,0},
{837260,507402,0},
{603432,519893,0},
{313679,546767,0},
{538165,524394,0},
{549026,523608,0},
{61083,627945,0},
{898345,504798,0},
{992556,501153,0},
{369999,539727,0},
{32847,665404,0},
{891292,505088,0},
{152715,579732,0},
{824104,507997,0},
{234057,559711,0},
{730507,512532,0},
{960529,502340,0},
{388395,537687,0},
{958170,502437,0},
{57105,631806,0},
{186025,570311,0},
{993043,501133,0},
{576770,521664,0},
{215319,563513,0},
{927342,503628,0},
{521353,525666,0},
{39563,653705,0},
{752516,511408,0},
{110755,595770,0},
{309749,547305,0},
{374379,539224,0},
{919184,503952,0},
{990652,501226,0},
{647780,517135,0},
{187177,570017,0},
{168938,574877,0},
{649558,517023,0},
{278126,552016,0},
{162039,576868,0},
{658512,516499,0},
{498115,527486,0},
{896583,504868,0},
{561170,522740,0},
{747772,511647,0},
{775093,510294,0},
{652081,516882,0},
{724905,512824,0},
{499707,527365,0},
{47388,642755,0},
{646668,517204,0},
{571700,522007,0},
{180430,571747,0},
{710015,513617,0},
{435522,532941,0},
{98137,602041,0},
{759176,511070,0},
{486124,528467,0},
{526942,525236,0},
{878921,505604,0},
{408313,535602,0},
{926980,503640,0},
{882353,505459,0},
{566887,522345,0},
{3326,853312,0},
{911981,504248,0},
{416309,534800,0},
{392991,537199,0},
{622829,518651,0},
{148647,581055,0},
{496483,527624,0},
{666314,516044,0},
{48562,641293,0},
{672618,515684,0},
{443676,532187,0},
{274065,552661,0},
{265386,554079,0},
{347668,542358,0},
{31816,667448,0},
{181575,571446,0},
{961289,502320,0},
{365689,540214,0},
{987950,501317,0},
{932299,503440,0},
{27388,677243,0},
{746701,511701,0},
{492258,527969,0},
{147823,581323,0},
{57918,630985,0},
{838849,507333,0},
{678038,515375,0},
{27852,676130,0},
{850241,506828,0},
{818403,508253,0},
{131717,587014,0},
{850216,506834,0},
{904848,504529,0},
{189758,569380,0},
{392845,537217,0},
{470876,529761,0},
{925353,503711,0},
{285431,550877,0},
{454098,531234,0},
{823910,508003,0},
{318493,546112,0},
{766067,510730,0},
{261277,554775,0},
{421530,534289,0},
{694130,514478,0},
{120439,591498,0},
{213308,563949,0},
{854063,506662,0},
{365255,540263,0},
{165437,575872,0},
{662240,516281,0},
{289970,550181,0},
{847977,506933,0},
{546083,523816,0},
{413252,535113,0},
{975829,501767,0},
{361540,540701,0},
{235522,559435,0},
{224643,561577,0},
{736350,512229,0},
{328303,544808,0},
{35022,661330,0},
{307838,547578,0},
{474366,529458,0},
{873755,505819,0},
{73978,617220,0},
{827387,507845,0},
{670830,515791,0},
{326511,545034,0},
{309909,547285,0},
{400970,536363,0},
{884827,505352,0},
{718307,513175,0},
{28462,674699,0},
{599384,520150,0},
{253565,556111,0},
{284009,551093,0},
{343403,542876,0},
{446557,531921,0},
{992372,501160,0},
{961601,502308,0},
{696629,514342,0},
{919537,503945,0},
{894709,504944,0},
{892201,505051,0},
{358160,541097,0},
{448503,531745,0},
{832156,507636,0},
{920045,503924,0},
{926137,503675,0},
{416754,534757,0},
{254422,555966,0},
{92498,605151,0},
{826833,507873,0},
{660716,516371,0},
{689335,514746,0},
{160045,577467,0},
{814642,508425,0},
{969939,501993,0},
{242856,558047,0},
{76302,615517,0},
{472083,529653,0},
{587101,520964,0},
{99066,601543,0},
{498005,527503,0},
{709800,513624,0},
{708000,513716,0},
{20171,698134,0},
{285020,550936,0},
{266564,553891,0},
{981563,501557,0},
{846502,506991,0},
{334,1190800,0},
{209268,564829,0},
{9844,752610,0},
{996519,501007,0},
{410059,535426,0},
{432931,533188,0},
{848012,506929,0},
{966803,502110,0},
{983434,501486,0},
{160700,577267,0},
{504374,526989,0},
{832061,507640,0},
{392825,537214,0},
{443842,532165,0},
{440352,532492,0},
{745125,511776,0},
{13718,726392,0},
{661753,516312,0},
{70500,619875,0},
{436952,532814,0},
{424724,533973,0},
{21954,692224,0},
{262490,554567,0},
{716622,513264,0},
{907584,504425,0},
{60086,628882,0},
{837123,507412,0},
{971345,501940,0},
{947162,502855,0},
{139920,584021,0},
{68330,621624,0},
{666452,516038,0},
{731446,512481,0},
{953350,502619,0},
{183157,571042,0},
{845400,507045,0},
{651548,516910,0},
{20399,697344,0},
{861779,506331,0},
{629771,518229,0},
{801706,509026,0},
{189207,569512,0},
{737501,512168,0},
{719272,513115,0},
{479285,529045,0},
{136046,585401,0},
{896746,504860,0},
{891735,505067,0},
{684771,514999,0},
{865309,506184,0},
{379066,538702,0},
{503117,527090,0},
{621780,518717,0},
{209518,564775,0},
{677135,515423,0},
{987500,501340,0},
{197049,567613,0},
{329315,544673,0},
{236756,559196,0},
{357092,541226,0},
{520440,525733,0},
{213471,563911,0},
{956852,502490,0},
{702223,514032,0},
{404943,535955,0},
{178880,572152,0},
{689477,514734,0},
{691351,514630,0},
{866669,506128,0},
{370561,539656,0},
{739805,512051,0},
{71060,619441,0},
{624861,518534,0},
{261660,554714,0},
{366137,540160,0},
{166054,575698,0},
{601878,519990,0},
{153445,579501,0},
{279899,551729,0},
{379166,538691,0},
{423209,534125,0},
{675310,515526,0},
{145641,582050,0},
{691353,514627,0},
{917468,504026,0},
{284778,550976,0},
{81040,612235,0},
{161699,576978,0},
{616394,519057,0},
{767490,510661,0},
{156896,578431,0},
{427408,533714,0},
{254849,555884,0},
{737217,512182,0},
{897133,504851,0},
{203815,566051,0},
{270822,553189,0},
{135854,585475,0},
{778805,510111,0},
{784373,509847,0},
{305426,547921,0},
{733418,512375,0},
{732087,512448,0},
{540668,524215,0},
{702898,513996,0},
{628057,518328,0},
{640280,517587,0},
{422405,534204,0},
{10604,746569,0},
{746038,511733,0},
{839808,507293,0},
{457417,530938,0},
{479030,529064,0},
{341758,543090,0},
{620223,518824,0},
{251661,556451,0},
{561790,522696,0},
{497733,527521,0},
{724201,512863,0},
{489217,528217,0},
{415623,534867,0},
{624610,518548,0},
{847541,506953,0},
{432295,533249,0},
{400391,536421,0},
{961158,502319,0},
{139173,584284,0},
{421225,534315,0},
{579083,521501,0},
{74274,617000,0},
{701142,514087,0},
{374465,539219,0},
{217814,562985,0},
{358972,540995,0},
{88629,607424,0},
{288597,550389,0},
{285819,550812,0},
{538400,524385,0},
{809930,508645,0},
{738326,512126,0},
{955461,502535,0},
{163829,576343,0},
{826475,507891,0},
{376488,538987,0},
{102234,599905,0},
{114650,594002,0},
{52815,636341,0},
{434037,533082,0},
{804744,508880,0},
{98385,601905,0},
{856620,506559,0},
{220057,562517,0},
{844734,507078,0},
{150677,580387,0},
{558697,522917,0},
{621751,518719,0},
{207067,565321,0},
{135297,585677,0},
{932968,503404,0},
{604456,519822,0},
{579728,521462,0},
{244138,557813,0},
{706487,513800,0},
{711627,513523,0},
{853833,506674,0},
{497220,527562,0},
{59428,629511,0},
{564845,522486,0},
{623621,518603,0},
{242689,558077,0},
{125091,589591,0},
{363819,540432,0},
{686453,514901,0},
{656813,516594,0},
{489901,528155,0},
{386380,537905,0},
{542819,524052,0},
{243987,557841,0},
{693412,514514,0},
{488484,528271,0},
{896331,504881,0},
{336730,543721,0},
{728298,512647,0},
{604215,519840,0},
{153729,579413,0},
{595687,520398,0},
{540360,524240,0},
{245779,557511,0},
{924873,503730,0},
{509628,526577,0},
{528523,525122,0},
{3509,847707,0},
{522756,525555,0},
{895447,504922,0},
{44840,646067,0},
{45860,644715,0},
{463487,530404,0},
{398164,536654,0},
{894483,504959,0},
{619415,518874,0},
{966306,502129,0},
{990922,501212,0},
{835756,507474,0},
{548881,523618,0},
{453578,531282,0},
{474993,529410,0},
{80085,612879,0},
{737091,512193,0},
{50789,638638,0},
{979768,501620,0},
{792018,509483,0},
{665001,516122,0},
{86552,608694,0},
{462772,530469,0},
{589233,520821,0},
{891694,505072,0},
{592605,520594,0},
{209645,564741,0},
{42531,649269,0},
{554376,523226,0},
{803814,508929,0},
{334157,544042,0},
{175836,572970,0},
{868379,506051,0},
{658166,516520,0},
{278203,551995,0},
{966198,502126,0},
{627162,518387,0},
{296774,549165,0},
{311803,547027,0},
{843797,507118,0},
{702304,514032,0},
{563875,522553,0},
{33103,664910,0},
{191932,568841,0},
{543514,524006,0},
{506835,526794,0},
{868368,506052,0},
{847025,506971,0},
{678623,515342,0},
{876139,505726,0},
{571997,521984,0},
{598632,520198,0},
{213590,563892,0},
{625404,518497,0},
{726508,512738,0},
{689426,514738,0},
{332495,544264,0},
{411366,535302,0},
{242546,558110,0},
{315209,546555,0},
{797544,509219,0},
{93889,604371,0},
{858879,506454,0},
{124906,589666,0},
{449072,531693,0},
{235960,559345,0},
{642403,517454,0},
{720567,513047,0},
{705534,513858,0},
{603692,519870,0},
{488137,528302,0},
{157370,578285,0},
{63515,625730,0},
{666326,516041,0},
{619226,518883,0},
{443613,532186,0},
{597717,520257,0},
{96225,603069,0},
{86940,608450,0},
{40725,651929,0},
{460976,530625,0},
{268875,553508,0},
{270671,553214,0},
{363254,540500,0},
{384248,538137,0},
{762889,510892,0},
{377941,538833,0},
{278878,551890,0},
{176615,572755,0},
{860008,506412,0},
{944392,502967,0},
{608395,519571,0},
{225283,561450,0},
{45095,645728,0},
{333798,544090,0},
{625733,518476,0},
{995584,501037,0},
{506135,526853,0},
{238050,558952,0},
{557943,522972,0},
{530978,524938,0},
{634244,517949,0},
{177168,572616,0},
{85200,609541,0},
{953043,502630,0},
{523661,525484,0},
{999295,500902,0},
{840803,507246,0},
{961490,502312,0},
{471747,529685,0},
{380705,538523,0},
{911180,504275,0},
{334149,544046,0},
{478992,529065,0},
{325789,545133,0},
{335884,543826,0},
{426976,533760,0},
{749007,511582,0},
{667067,516000,0},
{607586,519623,0},
{674054,515599,0},
{188534,569675,0},
{565185,522464,0},
{172090,573988,0},
{87592,608052,0},
{907432,504424,0},
{8912,760841,0},
{928318,503590,0},
{757917,511138,0},
{718693,513153,0},
{315141,546566,0},
{728326,512645,0},
{353492,541647,0},
{638429,517695,0},
{628892,518280,0},
{877286,505672,0},
{620895,518778,0},
{385878,537959,0},
{423311,534113,0},
{633501,517997,0},
{884833,505360,0},
{883402,505416,0},
{999665,500894,0},
{708395,513697,0},
{548142,523667,0},
{756491,511205,0},
{987352,501340,0},
{766520,510705,0},
{591775,520647,0},
{833758,507563,0},
{843890,507108,0},
{925551,503698,0},
{74816,616598,0},
{646942,517187,0},
{354923,541481,0},
{256291,555638,0},
{634470,517942,0},
{930904,503494,0},
{134221,586071,0},
{282663,551304,0},
{986070,501394,0},
{123636,590176,0},
{123678,590164,0},
{481717,528841,0},
{423076,534137,0},
{866246,506145,0},
{93313,604697,0},
{783632,509880,0},
{317066,546304,0},
{502977,527103,0},
{141272,583545,0},
{71708,618938,0},
{617748,518975,0},
{581190,521362,0},
{193824,568382,0},
{682368,515131,0},
{352956,541712,0},
{351375,541905,0},
{505362,526909,0},
{905165,504518,0},
{128645,588188,0},
{267143,553787,0},
{158409,577965,0},
{482776,528754,0},
{628896,518282,0},
{485233,528547,0},
{563606,522574,0},
{111001,595655,0},
{115920,593445,0},
{365510,540237,0},
{959724,502374,0},
{938763,503184,0},
{930044,503520,0},
{970959,501956,0},
{913658,504176,0},
{68117,621790,0},
{989729,501253,0},
{567697,522288,0},
{820427,508163,0},
{54236,634794,0},
{291557,549938,0},
{124961,589646,0},
{403177,536130,0},
{405421,535899,0},
{410233,535417,0},
{815111,508403,0},
{213176,563974,0},
{83099,610879,0},
{998588,500934,0},
{513640,526263,0},
{129817,587733,0},
{1820,921851,0},
{287584,550539,0},
{299160,548820,0},
{860621,506386,0},
{529258,525059,0},
{586297,521017,0},
{953406,502616,0},
{441234,532410,0},
{986217,501386,0},
{781938,509957,0},
{461247,530595,0},
{735424,512277,0},
{146623,581722,0},
{839838,507288,0},
{510667,526494,0},
{935085,503327,0},
{737523,512167,0},
{303455,548204,0},
{992779,501145,0},
{60240,628739,0},
{939095,503174,0},
{794368,509370,0},
{501825,527189,0},
{459028,530798,0},
{884641,505363,0},
{512287,526364,0},
{835165,507499,0},
{307723,547590,0},
{160587,577304,0},
{735043,512300,0},
{493289,527887,0},
{110717,595785,0},
{306480,547772,0},
{318593,546089,0},
{179810,571911,0},
{200531,566799,0},
{314999,546580,0},
{197020,567622,0},
{301465,548487,0},
{237808,559000,0},
{131944,586923,0},
{882527,505449,0},
{468117,530003,0},
{711319,513541,0},
{156240,578628,0},
{965452,502162,0},
{992756,501148,0},
{437959,532715,0},
{739938,512046,0},
{614249,519196,0},
{391496,537356,0},
{62746,626418,0},
{688215,514806,0},
{75501,616091,0},
{883573,505412,0},
{558824,522910,0},
{759371,511061,0},
{173913,573489,0},
{891351,505089,0},
{727464,512693,0},
{164833,576051,0},
{812317,508529,0},
{540320,524243,0},
{698061,514257,0},
{69149,620952,0},
{471673,529694,0},
{159092,577753,0},
{428134,533653,0},
{89997,606608,0},
{711061,513557,0},
{779403,510081,0},
{203327,566155,0},
{798176,509187,0},
{667688,515963,0},
{636120,517833,0},
{137410,584913,0},
{217615,563034,0},
{556887,523038,0},
{667229,515991,0},
{672276,515708,0},
{325361,545187,0},
{172115,573985,0},
{13846,725685,0}
						};
		for (int i = 0; i < 1000; i++) {
			long[] rank = rank(matrix[i][0],matrix[i][1]);
			if (rank[1] > 3005296 && rank[0] > 100000000000000l)
			StdOut.printf("%d\t:%d %d %d\t %d%n",i+1, matrix[i][0],matrix[i][1],rank[0],rank[1]);
		}
		StdOut.println(stopwatch.elapsedTime());
	}
}