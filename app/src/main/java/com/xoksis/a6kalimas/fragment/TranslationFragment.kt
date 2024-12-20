package com.xoksis.a6kalimas.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xoksis.a6kalimas.databinding.FragmentTranslationBinding

class TranslationFragment(val kalima: String) : Fragment() {

    private lateinit var binding: FragmentTranslationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment by binding
        binding = FragmentTranslationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            when (kalima) {
                "first" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلطَّيِّبَة\n" +
                            "Kalimat aṭ-Ṭayyibah\n" +
                            "(Word of Purity)"

                    textViewEnglishTranslation.text =
                        "There is no God but Allah Muhammad is the messenger of Allah."

                }

                "second" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلشَّهَادَة\n" +
                            "Kalimat ash-Shahādah\n" +
                            "(Word of Testimony)"

                    textViewEnglishTranslation.text =
                        "I bear witness that no-one is worthy of worship but Allah, the One alone, without partner, and I bear witness that Muhammad is His servant and Messenger."

                }

                "third" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلتَّمْجِيدْ\n" +
                            "Kalimat at-Tamjīd\n" +
                            "(Word of Majesty)"

                    textViewEnglishTranslation.text =
                        "Glory be to Allah and Praise to Allah, and there is no God but Allah, and Allah is the Greatest. And there is no Might or Power except with Allah."

                }

                "fourth" -> {
                    textViewKalimaName.text = "كَلِمَاتْ اَلتَّوْحِيدْ\n" +
                            "Kalimat at-Tawḥīd\n" +
                            "(Word of Oneness)"

                    textViewEnglishTranslation.text =
                        "(There is) none worthy of worship except Allah. He is only One. (There is) no partners for Him. For Him (is) the kingdom. And for Through Him (is) the Praise. He gives life and causes death. And He (is) Alive. He will not die, never, ever. Possessor of Majesty and Reverence. In His hand (is) the goodness. And He (is) the goodness. And He (is) on everything powerful."

                }

                "fifth" -> {
                    textViewKalimaName.text = "كَلِمَاتْ إِسْتِغْفَارْ\n" +
                            "Kalimat ʾIstighfār\n" +
                            "(Word of Penitence)"

                    textViewEnglishTranslation.text =
                        "I seek forgiveness from Allah, my lord, from every sin I committed knowingly or unknowingly, secretly or openly, and I turn towards Him from the sin that I know and from the sin that I do not know. Certainly You, You (are) the knower of the hidden things and the Concealer (of) the mistakes and the Forgiver (of) the sins. And (there is) no power and no strength except from Allah, the Most High, the Most Great."

                }

                "sixth" -> {
                    textViewKalimaName.text = "كَلِمَاتْ رَدّْ اَلْكُفْرْ\n" +
                            "Kalimat Radd al-Kufr\n" +
                            "(\"Word of Rejection of Disbelief\")"

                    textViewEnglishTranslation.text =
                        "O Allah! Certainly, I seek protection with You from, that I associate partner with You anything and I know it. And I seek forgiveness from You for that I do not know it. I repented from it and I made myself free from disbelief and polytheism and the falsehood and the back-biting and the innovation and the tell-tales and the bad deeds and the blame and the disobedience, all of them. And I submit and I say (there is) none worthy of worship except Allah, Muhammad is the Messenger of Allah.\n" +
                                "\n" +
                                "As we reflect on the meanings behind each Kalima, let us carry this newfound knowledge into our daily lives. May the principles embedded in these affirmations resonate in our actions, fostering a spirit of compassion, gratitude, and unity within the Muslim Ummah and beyond."

                }
            }
        }
    }
}