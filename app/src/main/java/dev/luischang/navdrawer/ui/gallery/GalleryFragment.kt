package dev.luischang.navdrawer.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import dev.luischang.navdrawer.databinding.FragmentGalleryBinding
import dev.luischang.navdrawer.ui.shared.HomeGalleryViewModel

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val homeGalleryViewModel: HomeGalleryViewModel by activityViewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.
}