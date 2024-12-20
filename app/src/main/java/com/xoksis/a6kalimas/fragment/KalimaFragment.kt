package com.xoksis.a6kalimas.fragment

import android.content.res.ColorStateList
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xoksis.a6kalimas.R
import com.xoksis.a6kalimas.databinding.FragmentKalimaBinding

class KalimaFragment(val kalima: String) : Fragment() {

    private lateinit var binding: FragmentKalimaBinding
    lateinit var  mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by binding.
        binding = FragmentKalimaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            floatingActionButtonPlayPause.imageTintList = ColorStateList.valueOf(Color.rgb(255, 255, 255))

            when (kalima) {
                "first" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلطَّيِّبَة\n" +
                            "Kalimat aṭ-Ṭayyibah\n" +
                            "(Word of Purity)"
                    textViewKalimaArabic.text =
                        "لَا إِلَٰهَ إِلَّا ٱللَّٰهُ مُحَمَّدٌ رَّسُولُ ٱللَّٰهِ"
                    textViewKalimaEnglish.text = "lā ʾilāha ʾillā -llāhu muḥammadur rasūlu -llāhi"

                    // MediaPlayer.
                    mediaPlayer =
                        MediaPlayer.create(requireContext(), R.raw.first_qalma_tayyab)

                    floatingActionButtonPlayPause.setOnClickListener {
                        if (mediaPlayer.isPlaying) {
                            mediaPlayer.pause()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_play_arrow_24)
                        } else {
                            mediaPlayer.start()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_pause_24)
                        }
                    }
                }

                "second" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلشَّهَادَة\n" +
                            "Kalimat ash-Shahādah\n" +
                            "(Word of Testimony)"
                    textViewKalimaArabic.text =
                        "أَشْهَدُ أَنْ لَا إِلَٰهَ إِلَّا ٱللَّٰهُ وَحْدَهُ لَا شَرِيكَ لَهُ وأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ"
                    textViewKalimaEnglish.text =
                        "ʾashhadu ʾan lā ilāha ʾillā -llāhu waḥdahū lā sharīka lahū wa-ʾashhadu ʾanna muḥhammadan ʿabduhū wa-rasūluhū"

                    // MediaPlayer.
                    mediaPlayer =
                        MediaPlayer.create(requireContext(), R.raw.second_qalma_shahada)

                    floatingActionButtonPlayPause.setOnClickListener {
                        if (mediaPlayer.isPlaying) {
                            mediaPlayer.pause()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_play_arrow_24)
                        } else {
                            mediaPlayer.start()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_pause_24)
                        }
                    }

                }

                "third" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلتَّمْجِيدْ\n" +
                            "Kalimat at-Tamjīd\n" +
                            "(Word of Majesty)"
                    textViewKalimaArabic.text =
                        "سُبْحَانَ ٱللَّٰهِ وَٱلْحَمْدُ لِلَّٰهِ وَلَا إِلَٰهَ إِلَّا ٱللَّٰهُ وَٱللَّٰهُ أَكْبَرُ وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِٱللَّٰهِ ٱلْعَلِيِّ ٱلْعَظِيمِ"
                    textViewKalimaEnglish.text =
                        "subḥāna -llāhi wa-l-ḥamdu li-llāhi wa-lā ʾilāha ʾillā -llāhu wa-llāhu ʾakbaru wa-lā ḥawla wa-lā quwwata ʾillā bi-llāhi l-ʿalīyi l-aẓīmi"

                    // MediaPlayer.
                    mediaPlayer =
                        MediaPlayer.create(requireContext(), R.raw.third_qalma_tamjeed)

                    floatingActionButtonPlayPause.setOnClickListener {
                        if (mediaPlayer.isPlaying) {
                            mediaPlayer.pause()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_play_arrow_24)
                        } else {
                            mediaPlayer.start()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_pause_24)
                        }
                    }

                }

                "fourth" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلتَّوْحِيدْ\n" +
                            "Kalimat at-Tawḥīd\n" +
                            "(Word of Oneness)"
                    textViewKalimaArabic.text =
                        "لَا إِلَٰهَ إِلَّا ٱللَّٰهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ ٱلْمُلْكُ وَلَهُ ٱلْحَمْدُ، يُحْيِي وَيُمِيتُ وَهُوَ حَيٌّ لَا يَمُوتُ أَبَدًا أَبَدًا، ذُو ٱلْجَلَالِ وَٱلْإِكْرَامِ بِيَدِهِ ٱلْخَيْرُ وَهُوَ عَلَىٰ كُلِّ شَيْءٍ قَدِيرٌ"
                    textViewKalimaEnglish.text =
                        "lā ilāha ʾillā -llāhu waḥdahū lā sharīka lahū lahū l-mulku wa-lahū l-ḥamdu yuḥyī wa-yumītu wa-huwa ḥayyun lā yamūtu ʾabadan ʾabadan ḏu l-jalāli wa-l-ʾikrām bi-yadihi-l k͟hayr wa-huwa ʿalā kulli shayʾin qadīrun"

                    // MediaPlayer.
                    mediaPlayer =
                        MediaPlayer.create(requireContext(), R.raw.fourth_qalma_tawheed)

                    floatingActionButtonPlayPause.setOnClickListener {
                        if (mediaPlayer.isPlaying) {
                            mediaPlayer.pause()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_play_arrow_24)
                        } else {
                            mediaPlayer.start()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_pause_24)
                        }
                    }

                }

                "fifth" -> {
                    textViewKalimaName.text = "كَلِمَاتْ إِسْتِغْفَارْ\n" +
                            "Kalimat ʾIstighfār\n" +
                            "(Word of Penitence)"
                    textViewKalimaArabic.text =
                        "أَسْتَغْفِرُ ٱللَّٰهَ رَبِّي مِنْ كُلِّ ذَنْبٍ أَذْنَبْتُهُ عَمَدًا أَوْ خَطَأً سِرًّا أوْ عَلَانِيَةً وَأَتُوبُ إِلَيْهِ مِنَ ٱلذَّنْبِ ٱلَّذِي أَعْلَمُ وَمِنَ ٱلذَّنْبِ ٱلَّذِي لَا أَعْلَمُ، إِنَّكَ أَنْتَ عَلَّامُ ٱلْغُيُوبِ وَسَتَّارُ ٱلْعُيُوْبِ وَغَفَّارُ ٱلذُّنُوبِ وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِٱللَّٰهِ ٱلْعَلِيِّ ٱلْعَظِيمِ"
                    textViewKalimaEnglish.text =
                        "ʾastaḡfiru -llāha rabbī min kulli ḏanbin ʾaḏnabtuhu ʿamdan ʾaw k͟haṭaʾan sirran wa-ʿalānīyatan wa-ʾatūbu ʾilayhi mina ḏ-ḏanbi l-laḏī ʾaʿlamu wa-mina ḏ-ḏanbi l-laḏī lā ʾaʿlamu ʾinnaka ʾanta ʿallāmu l-ḡuyūbi wa-sattāru l-ʿuyūbi wa-ḡaffāru ḏ-ḏunūbi wa-lā ḥawla wa-lā quwwata ʾillā bi-llāhi l-ʿalīyi l-aẓīmi"

                    // MediaPlayer.
                    mediaPlayer =
                        MediaPlayer.create(requireContext(), R.raw.fifth_qalma_istighfar)

                    floatingActionButtonPlayPause.setOnClickListener {
                        if (mediaPlayer.isPlaying) {
                            mediaPlayer.pause()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_play_arrow_24)
                        } else {
                            mediaPlayer.start()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_pause_24)
                        }
                    }

                }

                "sixth" -> {
                    textViewKalimaName.text = "كَلِمَاتْ رَدّْ اَلْكُفْرْ\n" +
                            "Kalimat Radd al-Kufr\n" +
                            "(\"Word of Rejection of Disbelief\")"
                    textViewKalimaArabic.text =
                        "ٱللَّٰهُمَّ إِنِّي أَعُوذُ بِكَ مِنْ أَنْ أُشْرِكَ بِكَ شَيْءً وَأَنَا أَعْلَمُ بِهِ وَأَسْتَغْفِرُكَ لِمَا لَا أَعْلَمُ بِهِ تُبْتُ عَنْهُ وَتَبَرَّأَتُ مِنَ ٱلْكُفْر وَٱلشِّرْكِ وَٱلْكِذْبِ وَٱلْغِيبَةِ وَٱلْبِدْعَةِ وَٱلنَّمِيمَةِ وَٱلْفَوَاحِشِ وَٱلْبُهْتَانِ وَٱلْمَعَاصِي كُلِّهَا وَأَسْلَمْتُ وَأَقُولُ لَا إِلَٰهَ إِلَّا ٱللَّٰهُ مُحَمَّدٌ رَسُولُ ٱللَّٰهِ"
                    textViewKalimaEnglish.text =
                        "ʾallāhumma ʾinnī ʾaʿūḏu bika min ʾan ʾušrika bika šayʾan wa-ʾanā ʾaʿlamu bihi wa-ʾastaḡfiruka limā lā ʾaʿlamu bihi tubtu ʿanhu wa-tabarraʾatu mina l-kufri wa-š-širki wa-l-kiḏbi wa-l-ḡībati wa-l-bidʿati wa-n-namīmati wa-l-fawāḥiši wa-l-buhtāni wa-l-maʿāṣī kullihā wa-ʾaslamtu wa-ʾaquwlu lā ʾilāha ʾillā -llāhu muḥammadun rasūlu -llāhi"

                    // MediaPlayer.
                    mediaPlayer =
                        MediaPlayer.create(requireContext(), R.raw.sixth_qalma_radd_e_kufr)

                    floatingActionButtonPlayPause.setOnClickListener {
                        if (mediaPlayer.isPlaying) {
                            mediaPlayer.pause()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_play_arrow_24)
                        } else {
                            mediaPlayer.start()
                            floatingActionButtonPlayPause.setImageResource(R.drawable.baseline_pause_24)

                        }
                    }

                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
    }
}