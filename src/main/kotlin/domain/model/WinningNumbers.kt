package domain.model

import domain.model.lotto.Lotto
import domain.model.lotto.LottoNumber

class WinningNumbers(
    val winningLotto: Lotto,
    val bonusNumber: LottoNumber
) {
    init {
        require(!winningLotto.numbers.contains(bonusNumber)) {
            OVERLAPPED_ERROR
        }
    }

    companion object {
        private const val OVERLAPPED_ERROR = "[ERROR] 당첨 번호와 보너스 볼은 중복될 수 없습니다."
    }
}
