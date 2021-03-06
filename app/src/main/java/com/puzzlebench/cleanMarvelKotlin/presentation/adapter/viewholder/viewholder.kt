package com.puzzlebench.cleanMarvelKotlin.presentation.adapter.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.puzzlebench.cleanMarvelKotlin.domain.model.Character
import com.puzzlebench.cleanMarvelKotlin.presentation.extension.getImageByUrlCenterCrop
import com.puzzlebench.cleanMarvelKotlin.presentation.listener.CharacterListener
import kotlinx.android.synthetic.main.character_cards_layout.view.*


class CharactersAdapterViewHolder(view: View, val listener: CharacterListener) : RecyclerView.ViewHolder(view) {

    fun bind(item: Character) = with(itemView) {
        tv_item.text = item.name
        val string = "${item.thumbnail.path}.${item.thumbnail.extension}"
        image_thumbnail.getImageByUrlCenterCrop(string)
        setOnClickListener { listener(item) }
    }
}