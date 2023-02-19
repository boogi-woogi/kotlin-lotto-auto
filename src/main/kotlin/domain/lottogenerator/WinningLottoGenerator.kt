package domain.lottogenerator

import domain.model.WinningLotto
import domain.model.lotto.LottoNumber

class WinningLottoGenerator : ManualLottoGenerator() {

    fun generateWinningLotto(InputNumbers: List<Int>, bonusNumber: Int): WinningLotto =
        WinningLotto(generate(InputNumbers), LottoNumber.from(bonusNumber))
}
