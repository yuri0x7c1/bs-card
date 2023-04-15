
import { css } from 'lit';

export const BsCardTextCss = css`

    :host {
        display: block;
    }

    :host > ::slotted(*:last-child) {
        margin-bottom: 0;
    }
`;
