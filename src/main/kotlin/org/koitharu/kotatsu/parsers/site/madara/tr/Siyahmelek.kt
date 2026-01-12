package org.koitharu.kotatsu.parsers.site.madara.tr

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("GRIMELEK", "Siyahmelek", "tr")
internal class Siyahmelek(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GRIMELEK, "siyahmelek.lol", 20) {
	override val datePattern = "d MMMM yyyy"
	override val listUrl = "manga/"
}
